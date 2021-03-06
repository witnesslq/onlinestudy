package com.xg12.manager;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xg12.entity.TopicType;
import com.xg12.entity.TopicTypeCriteria;

public interface TopicTypeManager {
	int countByExample(TopicTypeCriteria example);

	int deleteByExample(TopicTypeCriteria example);

	int deleteByPrimaryKey(Integer topicTypeId);

	int insert(TopicType record);

	int insertSelective(TopicType record);

	List<TopicType> selectByExample(TopicTypeCriteria example);

	TopicType selectByPrimaryKey(Integer topicTypeId);

	int updateByExampleSelective(@Param("record") TopicType record,
			@Param("example") TopicTypeCriteria example);

	int updateByExample(@Param("record") TopicType record,
			@Param("example") TopicTypeCriteria example);

	int updateByPrimaryKeySelective(TopicType record);

	int updateByPrimaryKey(TopicType record);
}