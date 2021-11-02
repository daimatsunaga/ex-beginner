package com.example.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class UserForm {
	@NotBlank(message="名前は必須です")
	private String name;
	@Range(min=0, max=200, message="年齢は0~200で入力してください")
	private String age;
	@Size(min=1, max=127, message="コメントは１文字以上１２７文字以内で記載してください")
	private String comment;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	@Override
	public String toString() {
		return "infoForm [name=" + name + ", age=" + age + ", comment=" + comment + "]";
	}
}
