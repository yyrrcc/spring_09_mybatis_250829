package com.mycompany.mybatistest.dao;

import java.util.List;

import com.mycompany.mybatistest.dto.UserOrderDto;

public interface OrderDao {
	
	// 유저가 주문한 내역
	public List<UserOrderDto> UserOrderListDao(String userid);

}
