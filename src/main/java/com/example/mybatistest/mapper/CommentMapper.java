package com.example.mybatistest.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {
	void deleteByBoardNo(int boardNo);	// mybatis는 업데이트 딜리트 인서트 자동 integer를 반환

}
