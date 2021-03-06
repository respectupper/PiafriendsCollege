package com.hanhangproject.demo;

import com.hanhangproject.demo.entity.PScript;
import com.hanhangproject.demo.entity.PUser;
import com.hanhangproject.demo.mapper.ScriptMapper.Manage.ManageScript;
import com.hanhangproject.demo.mapper.UserMapper.PUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import runner.MyApplicationRunner;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public MyApplicationRunner taskRunner(){
		return new MyApplicationRunner();
	}

}
