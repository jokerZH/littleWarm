package com.littlewarm.dao.mapper;

import com.littlewarm.model.TopicRelation;
import org.apache.ibatis.annotations.Param;

public interface TopicRelationMapper {
	TopicRelation getTopicRelationBySrc(@Param("srcId") String srcId);

	TopicRelation getTopicRelationByDes(@Param("desId") String desId);

	void updateTopicRelationExtra(@Param("srcId") String srcId, @Param("desId") String desId, @Param("extra") String extra);

	void insertTopicRelation(TopicRelation topicRelation);

	void deleteTopicRelation(@Param("srcId") String srcId, @Param("desId") String desId);
}
