package com.mycompany.mybatistest.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.mybatistest.dao.IDao;
import com.mycompany.mybatistest.dto.BoardDto;

@Controller
public class BoardController {
	
	@Autowired // 의존성 자동 주입
	private SqlSession sqlSession; 
	
	@RequestMapping (value = "/boardlist")
	public String boardlist(HttpServletRequest request, Model model) {
		
		IDao iDao = sqlSession.getMapper(IDao.class);
		List<BoardDto> boardDtos = iDao.boardlistDao();
		
		model.addAttribute("boardDtos", boardDtos);
		
		return "boardlist";
	}
}
