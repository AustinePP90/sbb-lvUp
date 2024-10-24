package kr.co.cofile.hdcdmybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.co.cofile.hdcdmybatis.domain.User;

@Mapper
public interface UserMapper {
	
	User findByUsername(String username);
	
	void save(User user);
	
}
