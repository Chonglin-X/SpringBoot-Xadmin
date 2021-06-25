package com.yunhe;

import com.yunhe.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Date;

@SpringBootTest
class Springboot02ApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	void contextLoads() throws SQLException {
		System.out.println(dataSource.getClass());
		System.out.println(dataSource.getConnection());
	}
}
