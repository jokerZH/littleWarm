package com.littlewarm.dao.mapper;

import com.littlewarm.model.Topic;
import com.littlewarm.model.User;
import org.apache.ibatis.annotations.Param;

public interface TopicMapper {
	Topic getTopic(@Param("id") String id);

	void updateTopicExtra(@Param("id") String id, @Param("extra") String extra);

	void updateTopicDesc(@Param("id") String id, @Param("desc") String desc);

	void insertTopic(Topic topic);

	void deleteTopic(@Param("id") String id);
}
