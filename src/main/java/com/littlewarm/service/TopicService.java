package com.littlewarm.service;

import com.littlewarm.dao.mapper.TopicMapper;
import com.littlewarm.model.Topic;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("topicService")
public class TopicService {

    @Resource(name="topicDao")
    private TopicMapper topicMapper;


    /* TODO */
    Topic addTopic(String )

    Topic getTopic(String id) {
        return topicMapper.getTopic(id);
    }

	void deleteTopic(String id) {
	    topicMapper.deleteTopic(id);
    }
}
