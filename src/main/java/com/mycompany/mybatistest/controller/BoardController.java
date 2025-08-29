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
	
	@RequestMapping (value = "/boardwrite")
	public String boardwrite() {
		return "boardwrite";
	}
	
	@RequestMapping (value = "/boardwriteOk")
	public String boardwriteOk(HttpServletRequest request, Model model) {
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		String bname = request.getParameter("bname");
		IDao iDao = sqlSession.getMapper(IDao.class);
		iDao.boardWriteDao(btitle, bcontent, bname);
		return "redirect:boardlist";
	}
	
	@RequestMapping (value = "/delete")
	public String delete() {
		return "delete";
	}
	
	@RequestMapping (value = "/deleteOk")
	public String deleteOk(HttpServletRequest request, Model model) {
		int bnum = Integer.parseInt(request.getParameter("bnum"));
		IDao iDao = sqlSession.getMapper(IDao.class);
		int result = iDao.boardDeleteDao(bnum);
		if (result == 0) {
			model.addAttribute("deleteErrorMsg", "글 삭제 실패 됐습니다.");
			return "delete";
		} else {
			return "redirect:boardlist";
		}
	}
}
