package com.mariworld.bootboardjpamybatis.service;

import com.mariworld.bootboardjpamybatis.dto.BoardDTO;
import com.mariworld.bootboardjpamybatis.dto.PageRequestDTO;
import com.mariworld.bootboardjpamybatis.dto.PageResultDTO;
import com.mariworld.bootboardjpamybatis.entity.Board;
import com.mariworld.bootboardjpamybatis.entity.Member;
import com.mariworld.bootboardjpamybatis.entity.MemberRole;
import com.mariworld.bootboardjpamybatis.mapper.BoardMapper;
import com.mariworld.bootboardjpamybatis.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardRepository boardRepository;
    private final BoardMapper boardMapper;
    @Override
    public List<Object[]> getList() {
        return boardRepository.getBoardWithMember();
    }

    @Override
    public List<Board> getListTest() {
        return boardRepository.findAll();
    }

    @Override
    public PageResultDTO<BoardDTO, Object[]> getList(PageRequestDTO pageRequestDTO) {
        PageRequest pageRequest = pageRequestDTO.makePageRequest(Sort.by("bno").descending());

        Page<Object[]> entity = boardRepository.getBoardWithMember(pageRequest);

        Function<Object[],BoardDTO> fn = (en -> entityToDTO(
                (Board) en[0],(Member) en[1]
        ));
        return new PageResultDTO<>(entity,fn);
    }

    @Override @Transactional
    public PageResultDTO<BoardDTO, Object[]> getList_m(PageRequestDTO pageRequestDTO) {
        List<BoardDTO> dtoList = boardMapper.getList(pageRequestDTO);
        int count =boardMapper.countAll();

        Map<Integer, List<BoardDTO>> list = new HashMap<>();
        list.put(count, dtoList);

        return new PageResultDTO<>(pageRequestDTO, list);
    }

    @Override
    public Long register(BoardDTO dto) {
        Member member = Member.builder().email(dto.getEmail()).build();
        Board board = Board.builder()
                .title(dto.getTitle())
                .content(dto.getContent())
                .member(member)
                .build();
        boardRepository.save(board);
        return board.getBno();
    }

    @Override
    public BoardDTO read(Long bno) {
        Object result = boardRepository.getBoardWithMember(bno);
        Object[] arr = (Object[])result;
        return entityToDTO((Board) arr[0],(Member)arr[1]);
    }

    @Override
    public void modify(BoardDTO dto) {
        Board board = boardRepository.findById(dto.getBno()).get();
        if(board!=null){
            board.changeTitle(dto.getTitle());
            board.changeContent(dto.getContent());
            boardRepository.save(board);
        }
    }

    @Override
    public void remove(Long bno) {
        boardRepository.deleteById(bno);
    }
}
