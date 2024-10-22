package kr.co.cofile.hdcdmybatis.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AllExceptionHandler {
	@ExceptionHandler(BoardNotFoundException.class)
	public ResponseEntity<String> handleAllException(Exception e) {
		return ResponseEntity.badRequest().body(e.getMessage());
	}
}
