package com.xg12.dao;

import com.xg12.entity.RoleOperation;
import com.xg12.entity.criteria.RoleOperationCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * --------------------------个人声明-----------------------------
 * 
 * @Project: onlinestudy
 * @File: RoleOperationDao.java
 * @Date: 2015年9月12日 下午5:27:27
 * @Author: ZHUANGZHIXUAN
 */
public interface RoleOperationDao {
	int countByExample(RoleOperationCriteria example);

	int deleteByExample(RoleOperationCriteria example);

	int insert(RoleOperation record);

	int insertSelective(RoleOperation record);

	List<RoleOperation> selectByExample(RoleOperationCriteria example);

	int updateByExampleSelective(@Param("record") RoleOperation record,
			@Param("example") RoleOperationCriteria example);

	int updateByExample(@Param("record") RoleOperation record,
			@Param("example") RoleOperationCriteria example);
}