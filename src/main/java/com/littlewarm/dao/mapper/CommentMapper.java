package com.littlewarm.dao.mapper;

import com.littlewarm.model.Comment;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
	Comment getCommentByUser(@Param("userId") String userId);

	Comment getCommentByTopic(@Param("topicId") String topicId);

	void updateCommentExtra(@Param("userId") String id, @Param("topicId") String topicId, @Param("extra") String extra);

	void insertComment(Comment comment);

	void deleteComment(@Param("userId") String id, @Param("topicId") String topicId);
}
