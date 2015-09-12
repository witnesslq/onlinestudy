package com.xg12.dao;

import com.xg12.entity.Operation;
import com.xg12.entity.criteria.OperationCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
--------------------------个人声明-----------------------------
* @Project: onlinestudy
* @File: OperationDao.java
* @Date: 2015年9月12日 下午5:27:03
* @Author: ZHUANGZHIXUAN 
*/
public interface OperationDao {
	int countByExample(OperationCriteria example);

	int deleteByExample(OperationCriteria example);

	int deleteByPrimaryKey(Integer operationId);

	int insert(Operation record);

	int insertSelective(Operation record);

	List<Operation> selectByExample(OperationCriteria example);

	Operation selectByPrimaryKey(Integer operationId);

	int updateByExampleSelective(@Param("record") Operation record,
			@Param("example") OperationCriteria example);

	int updateByExample(@Param("record") Operation record,
			@Param("example") OperationCriteria example);

	int updateByPrimaryKeySelective(Operation record);

	int updateByPrimaryKey(Operation record);
}