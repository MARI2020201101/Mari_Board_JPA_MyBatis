package com.mariworld.bootboardjpamybatis.service;

import com.mariworld.bootboardjpamybatis.dto.BoardDTO;
import com.mariworld.bootboardjpamybatis.dto.PageRequestDTO;
import com.mariworld.bootboardjpamybatis.dto.PageResultDTO;
import com.mariworld.bootboardjpamybatis.entity.Board;
import com.mariworld.bootboardjpamybatis.entity.Member;

import java.util.List;

public interface BoardService {

    List<Object[]> getList();
    List<Board> getListTest();
    //public List<Object[]> getList(PageRequestDTO pageRequestDTO);
    PageResultDTO<BoardDTO, Object[]> getList(PageRequestDTO pageRequestDTO);
    PageResultDTO<BoardDTO, Object[]> getList_m(PageRequestDTO pageRequestDTO);
    Long register(BoardDTO dto);
    BoardDTO read(Long bno);
    void modify(BoardDTO dto);
    void remove(Long bno);

    default BoardDTO entityToDTO(Board board, Member member){
        BoardDTO dto = BoardDTO.builder()
                .bno(board.getBno())
                .title(board.getTitle())
                .content(board.getContent())
                .email(member.getEmail())
                .name(member.getName())
                .regDate(board.getRegDate())
                .modDate(board.getModDate())
                .build();
        return dto;
    }

    default Board dtoToEntity(BoardDTO dto){
        Member member = Member.builder().email(dto.getEmail()).build();
        Board board = Board.builder()
                .title(dto.getTitle())
                .content(dto.getContent())
                .member(member)
                .build();
        return board;
    }

}
