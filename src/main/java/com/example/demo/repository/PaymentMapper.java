package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.model.Payment;

@Mapper
public interface PaymentMapper {
	
	//全件取得処理
	@Select("select * from payment")
	List<Payment> select();
	
	//一件取得処理
	@Select("select * from payment where id = #{id}")
	public Payment selectOne(int id);
	
	//追加処理
	@Options(useGeneratedKeys = true)//自動で連番のidを取得する
	@Insert("insert into payment (name, category, price, memo, create_day) values (#{name}, #{category}, #{price}, #{memo}, #{create_day})")
	void insert(Payment payment);
	
	//更新処理
	@Update("update payment set name = #{name}, category=#{category}, price=#{price}, memo=#{memo}, create_day=#{create_day} where id = #{id}")
	void update(Payment payment);
	
	//消去処理
	@Delete("delete from payment where id = #{id}")
	void delete(int id);
	

}
