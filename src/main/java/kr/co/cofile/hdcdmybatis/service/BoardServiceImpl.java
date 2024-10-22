package kr.co.cofile.hdcdmybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.cofile.hdcdmybatis.domain.Board;
import kr.co.cofile.hdcdmybatis.exception.BoardNotFoundException;
import kr.co.cofile.hdcdmybatis.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public Board read(Integer id) throws BoardNotFoundException {
		
		return boardMapper.getBoardById(id)
				.orElseThrow(() -> new BoardNotFoundException("게시물 없엉 ㅠㅜ"));
	}

}
