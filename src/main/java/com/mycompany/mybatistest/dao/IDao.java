package com.mycompany.mybatistest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mycompany.mybatistest.dto.BoardDto;

public interface IDao {
	
	// 모든 글 리스트 불러오는 추상 메서드 선언
	public List<BoardDto> boardlistDao();
	
	// 글쓰기
	//public void boardWriteDao(String btitle, String bcontent, String bname);
	public void boardWriteDao(@Param("btitle") String btitle, @Param("bcontent") String bcontent, @Param("bname") String bname);
	
	// 삭제
	public int boardDeleteDao(int bnum);
}
