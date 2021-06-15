package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Payment;

@Mapper
public interface PaymentMapper {
	
	@Select("select * from payment")
	List<Payment> select();
	

}
