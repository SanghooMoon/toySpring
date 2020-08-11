package com.mycom.toyLMS.board.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycom.toyLMS.board.dao.BoardDAO;
import com.mycom.toyLMS.board.vo.Article;
import com.mycom.toyLMS.common.vo.PageInfo;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDAO bDAO;
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	// 전체 게시판 조회
	@Override
	public ArrayList<Article> showBoard(PageInfo pi) {
		// TODO Auto-generated method stub
		return bDAO.selectBoard(sqlSession, pi);
	}

	// 글 하나 조회
	@Override
	public Article showDetail(int bno) {
		// TODO Auto-generated method stub
		return bDAO.selectArticle(sqlSession, bno);
	}

	@Override
	public int listCount() {
		// TODO Auto-generated method stub
		return bDAO.selectListCount(sqlSession);
	}
	
}