package com.mariworld.bootboardjpamybatis.mapper;

import com.mariworld.bootboardjpamybatis.dto.BoardDTO;
import com.mariworld.bootboardjpamybatis.dto.PageRequestDTO;
import com.mariworld.bootboardjpamybatis.entity.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

@Mapper
public interface BoardMapper {
    int countAll();
    List<BoardDTO> getListTest();
    List<BoardDTO> getListTest2(PageRequestDTO pageRequestDTO);
    List<BoardDTO> getList(PageRequestDTO pageRequestDTO);

}
