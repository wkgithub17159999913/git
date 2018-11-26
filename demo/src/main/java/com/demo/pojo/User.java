package com.demo.pojo;

import java.util.Date;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Configuration
@ConfigurationProperties(prefix="com")
@PropertySource(value="classpath:resources.properties")
public class User {
	private String name;
	private String password;
	@JsonInclude(Include.NON_NULL)
	private Integer age;
	@JsonFormat(pattern="yyyy-mm-dd hh:mm:ss a E",locale="zh",timezone="GTM+8")
	private Date time;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User(String name, String password, Integer age, Date time, String id) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
		this.time = time;
		this.id = id;
	}
	public User() {
		super();
	}
}