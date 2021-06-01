package com.mariworld.bootboardjpamybatis.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
public class ConnectionTest {

    @Autowired
    private DataSource ds;

    @Test
    public void testDataSource() throws Exception {
        System.out.println("DS : " + ds);
        try (Connection conn = ds.getConnection()) {
            System.out.println("Connection : " + conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
