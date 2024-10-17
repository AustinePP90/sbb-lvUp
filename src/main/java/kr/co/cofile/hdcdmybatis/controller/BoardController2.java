package kr.co.cofile.hdcdmybatis.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.cofile.hdcdmybatis.domain.Board2;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/boards2")
public class BoardController2 {
	
	@GetMapping
	public List<Board2> getBoard() {
		
		Board2 board1 = new Board2();
		board1.setId(1);
		board1.setTitle("HTML");
		board1.setContent("HTML&HTML&HTML");
		board1.setWriter("Kim");
		
		Board2 board2 = new Board2("CSS", "CSS&CSS&CSS");
		board2.setId(2);
		board2.setWriter("Park");
		
		Board2 board3 = new Board2(3, "Vue", "Vue&Vue&Vue", "Dong");
		
		List<Board2> contentList = new ArrayList<>();
		contentList.add(board1);
		contentList.add(board2);
		contentList.add(board3);
		
		return contentList;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Board2> getBoard(@PathVariable("id") int id) {
		Board2 board1 = Board2.builder()
				.id(id)
				.title("JAVA")
				.content("JAVA&JAVA&JAVA")
				.writer("Yang")
				.build();
		
		return ResponseEntity.ok(board1);
	}
	
	@PostMapping
	public Map<String, Object> addBoard2(@RequestBody Board2 board) {
		board.setId(7);
		board.setTitle("React");
		board.setContent("React&React&React");
		board.setWriter("Han");
		
		Map<String, Object> result = new HashMap<>();
		result.put("message", "등록 성공!!!!!!!");
		result.put("board", board);
		
		return result;
	}
	
}
