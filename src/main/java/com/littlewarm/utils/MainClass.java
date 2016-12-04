package com.littlewarm.utils;

import com.littlewarm.dao.mapper.CommentMapper;
import com.littlewarm.dao.mapper.TopicMapper;
import com.littlewarm.dao.mapper.TopicRelationMapper;
import com.littlewarm.dao.mapper.UserMapper;
import com.littlewarm.model.Comment;
import com.littlewarm.model.Topic;
import com.littlewarm.model.TopicRelation;
import com.littlewarm.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        testUser(ctx);
        testTopic(ctx);
        testComment(ctx);
        testTopicRelation(ctx);
    }

    private static void testTopicRelation(ApplicationContext ctx) {
        Topic topic = new Topic("topic", "hell", "hello");
        TopicRelationMapper mapper = (TopicRelationMapper) ctx.getBean("topicRelationDao");

        mapper.deleteTopicRelation("topic", "topic");

        ((TopicMapper)ctx.getBean("topicDao")).deleteTopic("topic");
        ((TopicMapper)ctx.getBean("topicDao")).insertTopic(topic);

        try {
            TopicRelation topicRelation = new TopicRelation("topic", "topic", "extra");

            mapper.insertTopicRelation(topicRelation);
            System.out.println(mapper.getTopicRelationBySrc("topic"));
            System.out.println(mapper.getTopicRelationByDes("topic"));

            mapper.updateTopicRelationExtra("topic", "topic", "hellworld");
            System.out.println(mapper.getTopicRelationBySrc("topic"));
            System.out.println(mapper.getTopicRelationByDes("topic"));

            mapper.deleteTopicRelation("topic", "topic");
            System.out.println(mapper.getTopicRelationBySrc("topic"));
            System.out.println(mapper.getTopicRelationByDes("topic"));
        } finally {
            mapper.deleteTopicRelation("topic", "topic");
            ((UserMapper)ctx.getBean("userDao")).deleteUser("user");
            ((TopicMapper)ctx.getBean("topicDao")).deleteTopic("topic");
        }
    }


    private static void testComment(ApplicationContext ctx) {
        User user = new User("user", "hello");
        Topic topic = new Topic("topic", "hell", "hello");
        CommentMapper mapper = (CommentMapper) ctx.getBean("commentDao");

        mapper.deleteComment("user", "topic");

        ((UserMapper)ctx.getBean("userDao")).deleteUser("user");
        ((UserMapper)ctx.getBean("userDao")).insertUser(user);
        ((TopicMapper)ctx.getBean("topicDao")).deleteTopic("topic");
        ((TopicMapper)ctx.getBean("topicDao")).insertTopic(topic);

        try {
            Comment comment = new Comment("user", "topic", "lll");

            mapper.insertComment(comment);
            System.out.println(mapper.getCommentByUser("user"));
            System.out.println(mapper.getCommentByTopic("topic"));

            mapper.updateCommentExtra("user", "topic", "hellworld");
            System.out.println(mapper.getCommentByUser("user"));
            System.out.println(mapper.getCommentByTopic("topic"));

            mapper.deleteComment("user", "topic");
            System.out.println(mapper.getCommentByUser("user"));
            System.out.println(mapper.getCommentByTopic("topic"));
        } finally {
            mapper.deleteComment("user", "topic");
            ((UserMapper)ctx.getBean("userDao")).deleteUser("user");
            ((TopicMapper)ctx.getBean("topicDao")).deleteTopic("topic");
        }
    }


    private static void testTopic(ApplicationContext ctx) {
        TopicMapper mapper = (TopicMapper) ctx.getBean("topicDao");

        Topic topic = new Topic("hello", "world", "hehe");

        mapper.insertTopic(topic);
        System.out.println(mapper.getTopic("hello"));

        mapper.updateTopicExtra("hello", "fukc");
        System.out.println(mapper.getTopic("hello"));

        mapper.updateTopicDesc("hello", "fuck");
        System.out.println(mapper.getTopic("hello"));

        mapper.deleteTopic("hello");
    }

    private static void testUser(ApplicationContext ctx) {
        UserMapper mapper = (UserMapper) ctx.getBean("userDao");

        User user = new User("hello", "world");

        mapper.insertUser(user);

        System.out.println(mapper.getUser("hello"));

        mapper.updateUserExtra("hello", "fukc");

        System.out.println(mapper.getUser("hello"));

        mapper.deleteUser("hello");
    }
}
