package com.xg12.dao;

import com.xg12.entity.CourseExam;
import com.xg12.entity.criteria.CourseExamCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
--------------------------个人声明-----------------------------
* @Project: onlinestudy
* @File: CourseExamDao.java
* @Date: 2015年9月12日 下午5:26:45
* @Author: ZHUANGZHIXUAN 
*/
public interface CourseExamDao {
	int countByExample(CourseExamCriteria example);

	int deleteByExample(CourseExamCriteria example);

	int insert(CourseExam record);

	int insertSelective(CourseExam record);

	List<CourseExam> selectByExample(CourseExamCriteria example);

	int updateByExampleSelective(@Param("record") CourseExam record,
			@Param("example") CourseExamCriteria example);

	int updateByExample(@Param("record") CourseExam record,
			@Param("example") CourseExamCriteria example);
}