package com.spring.mvc;

import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Student {

	private String name;
	private Long id;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date date;
	private List<String> courses;
	private String gender;
	private String type;
}
