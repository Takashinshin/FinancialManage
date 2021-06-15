package com.example.demo.model;

import lombok.Data;

@Data
public class Payment {
	
	private int  id;
	
	private String name;
	
	private String category;
	
	private int price;
	
	private String memo;
	
	private String create_day;
	

}
