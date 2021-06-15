package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Payment;
import com.example.demo.repository.PaymentMapper;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentMapper mapper;
	
	
	//全件取得
	@Transactional
	public List<Payment> select(){
		return mapper.select();
	}

}
