package com.littlewarm.dao.mapper;

import com.littlewarm.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	User getUser(@Param("id") String id);

	void updateExtra(@Param("id") String id, @Param("extra") String extra);

	void insertUser(User user);

	void deleteUser(String id);
}
