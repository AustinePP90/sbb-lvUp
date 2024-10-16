package kr.co.cofile.hdcdmybatis.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.cofile.hdcdmybatis.domain.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<List<User>> getUsers() {
		LocalDateTime now = LocalDateTime.now();
        
		// 롬복 @Builder
		User user1 = User.builder()
				.id(1)
				.usrname("yang")
				.psw("1234")
				.createdTime(now)
				.build();
		String encPsw = BCrypt.hashpw(user1.getPsw(), BCrypt.gensalt());
		user1.setPsw(encPsw);
		
		// @NoArgsConstructor
		User user2 = new User();
		String encPsw2 = BCrypt.hashpw("1234", BCrypt.gensalt());
		user2.setId(2);
		user2.setUsrname("austine");
		user2.setPsw(encPsw2);
		user2.setCreatedTime(now);
		
		// @RequiredArgsConstructor
		User user3 = new User("kim", "1234");
		String encPsw3 = BCrypt.hashpw(user3.getPsw(), BCrypt.gensalt());
		user3.setId(3);
		user3.setPsw(encPsw3);
		user3.setCreatedTime(now);
		
		// @AllArgsConstructor
		User user4 = new User(4, "Koo","1234", now);
		String encPsw4 = BCrypt.hashpw(user4.getPsw(), BCrypt.gensalt());
		user4.setPsw(encPsw4);
		
		List<User> userList = new ArrayList<>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		
		return ResponseEntity.ok(userList);
	}
}
