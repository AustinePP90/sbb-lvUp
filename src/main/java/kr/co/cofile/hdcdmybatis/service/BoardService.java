package kr.co.cofile.hdcdmybatis.service;

import kr.co.cofile.hdcdmybatis.domain.Board;
import kr.co.cofile.hdcdmybatis.exception.BoardNotFoundException;

public interface BoardService {
	Board read(Integer id) throws BoardNotFoundException;
}
