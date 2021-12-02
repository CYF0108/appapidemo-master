package com.lin.appapidemo;

import com.lin.appapidemo.mapper.shixun.ReaderMapper;
import com.lin.appapidemo.model.shixun.Reader;
import com.lin.appapidemo.util.DateTimeUtil;
import javafx.scene.control.TextArea;
import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppapidemoApplicationTests {

    @Autowired
    ReaderMapper readerMapper;

    @Test
    public void contextLoads() {
        String account = "test";
        String name = "test_name";
        String sex = "男";
        int condi = 0;
        readerMapper.insert(new Reader(account, account, name, sex, DateTimeUtil.getDate(), condi));

    }

}
