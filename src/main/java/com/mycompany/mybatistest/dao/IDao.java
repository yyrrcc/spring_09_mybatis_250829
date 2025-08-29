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
	
	// 모든 글 개수 가져오기
	public int boardCount();
	
	// 글 내용 보기
	public BoardDto contentView(int bnum);
	
	// 글 수정
	public int contentModify(String btitle, String bcontent, String bname, int bnum);
}
