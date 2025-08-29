package com.mycompany.mybatistest.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.mybatistest.dao.OrderDao;
import com.mycompany.mybatistest.dto.UserOrderDto;

@Controller
public class OrderControlloer {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping (value = "/orderlist")
	public String orderlist(HttpServletRequest request, Model model) {
		OrderDao orderDao = sqlSession.getMapper(OrderDao.class);
		List<UserOrderDto> userOrderDtos = orderDao.UserOrderListDao("kim");
		model.addAttribute("userOrderDtos", userOrderDtos);
		return "orderlist";
	}

}
