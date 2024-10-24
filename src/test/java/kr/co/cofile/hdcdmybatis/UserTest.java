package kr.co.cofile.hdcdmybatis;

import kr.co.cofile.hdcdmybatis.domain.User;
import kr.co.cofile.hdcdmybatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
@Slf4j
class UserTest {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserMapper userMapper;  // 사용자 추가를 위한 매퍼

    @Test
    @DisplayName("사용자 추가 테스트")
    void addUser() {
        // 테스트용 사용자 생성
        User user = new User();
        user.setUsername("test2");
        user.setPassword(passwordEncoder.encode("1234"));
        user.setEnabled(true);
        user.setRole("ROLE_USER");

        log.info("password: {}", user.getPassword());
        // userMapper를 통해 데이터베이스에 사용자 추가
        userMapper.save(user);
    }
}