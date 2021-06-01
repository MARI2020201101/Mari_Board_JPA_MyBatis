package com.mariworld.bootboardjpamybatis.service;

import com.mariworld.bootboardjpamybatis.dto.BoardDTO;
import com.mariworld.bootboardjpamybatis.dto.PageRequestDTO;
import com.mariworld.bootboardjpamybatis.dto.PageResultDTO;
import com.mariworld.bootboardjpamybatis.entity.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardServiceTest {
    @Autowired
    private BoardService boardService;

    @Test
    public void getListTest(){
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().page(1).size(10).build();
        PageResultDTO<BoardDTO,Object[]> result = boardService.getList(pageRequestDTO);
        result.getDtoList().forEach(System.out::println);
    }

    @Test
    public void getListMapperTest(){
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().page(1).size(10).build();
        PageResultDTO<BoardDTO,Object[]> result = boardService.getList_m(pageRequestDTO);
        result.getDtoList().forEach(System.out::println);
        result.getPageList().forEach(System.out::println);
        System.out.println("result.getTotal() : "+result.getTotal());
    }
}
