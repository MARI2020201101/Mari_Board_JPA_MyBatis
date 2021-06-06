package com.mariworld.bootboardjpamybatis;

import com.mariworld.bootboardjpamybatis.controller.BoardController;
import com.mariworld.bootboardjpamybatis.dto.BoardDTO;
import javassist.CtBehavior;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.Annotation;

@SpringBootTest
public class ApplicationContextTest {
    @Autowired
    ApplicationContext ac;


    @Test
    void findAllBean() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean = ac.getBean(beanDefinitionName);
            System.out.println("beanDefinitionName = " + beanDefinitionName + "" +
                    ", object = " + bean);
        }
    }

}
