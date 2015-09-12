package com.xg12.dao;

import com.xg12.entity.TopicAnswer;
import com.xg12.entity.criteria.TopicAnswerCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * --------------------------个人声明-----------------------------
 * 
 * @Project: onlinestudy
 * @File: TopicAnswerDao.java
 * @Date: 2015年9月12日 下午5:28:28
 * @Author: ZHUANGZHIXUAN
 */
public interface TopicAnswerDao {
	int countByExample(TopicAnswerCriteria example);

	int deleteByExample(TopicAnswerCriteria example);

	int deleteByPrimaryKey(Integer topicAnswerId);

	int insert(TopicAnswer record);

	int insertSelective(TopicAnswer record);

	List<TopicAnswer> selectByExample(TopicAnswerCriteria example);

	TopicAnswer selectByPrimaryKey(Integer topicAnswerId);

	int updateByExampleSelective(@Param("record") TopicAnswer record,
			@Param("example") TopicAnswerCriteria example);

	int updateByExample(@Param("record") TopicAnswer record,
			@Param("example") TopicAnswerCriteria example);

	int updateByPrimaryKeySelective(TopicAnswer record);

	int updateByPrimaryKey(TopicAnswer record);
}