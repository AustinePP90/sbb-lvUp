package kr.co.cofile.hdcdmybatis.mapper;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import kr.co.cofile.hdcdmybatis.domain.Board;

@Mapper
public interface BoardMapper {
	// null 값을 반환하면 orElseThrow로 예외처리를 한다
	Optional<Board> getBoardById(Integer id);
}
