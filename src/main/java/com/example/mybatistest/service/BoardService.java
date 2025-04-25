package com.example.mybatistest.service;

import java.beans.Transient;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.mybatistest.dto.Board;
import com.example.mybatistest.mapper.BoardMapper;
import com.example.mybatistest.mapper.CommentMapper;

@Service
@Transactional
public class BoardService {
	@Autowired BoardMapper boardMapper;
	@Autowired CommentMapper commentMapper;
	public List<Board> getAll(){
		// getAll()은 중계 역활
		return boardMapper.selectAll();
	}
	
	public void remove(int boardNo) {
		commentMapper.deleteByBoardNo(boardNo);	// 실패하면 ㅡ> 예외발생 - @Transactional 에노테이션의 의해 현재 메소드 실행이 rollback 된다.
		boardMapper.deleteByBoardNo(boardNo);	// 실패하면 ㅡ> 예외발생	- @Transactional 에노테이션의 의해 현재 메소드 실행이 rollback 된다.
	}
}
