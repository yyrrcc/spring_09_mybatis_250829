package com.mycompany.mybatistest.dao;

import java.util.List;

import com.mycompany.mybatistest.dto.BoardDto;

public interface IDao {
	
	// 모든 글 리스트 불러오는 추상 메서드 선언
	public List<BoardDto> boardlistDao();
}
