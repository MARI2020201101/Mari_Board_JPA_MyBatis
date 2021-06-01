package com.mariworld.bootboardjpamybatis.mapper;

import com.mariworld.bootboardjpamybatis.dto.PageRequestDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

@SpringBootTest
public class BoardMapperTest {
    @Autowired
    private BoardMapper boardMapper;

    @Test
    public void countAllTest(){
        System.out.println("boardMapper.countAll() : "+ boardMapper.countAll());
    }

    @Test
    public void getListTest1(){
        boardMapper.getListTest().forEach(System.out::println);
    }

    @Test
    public void getListTest2(){
        boardMapper.getListTest2(
                PageRequestDTO.builder().page(0).size(10).build())
                .forEach(System.out::println);
    }
}
