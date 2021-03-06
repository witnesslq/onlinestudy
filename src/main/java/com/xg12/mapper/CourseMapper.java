package com.xg12.mapper;

import com.xg12.entity.Course;
import com.xg12.entity.CourseCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMapper {
    int countByExample(CourseCriteria example);

    int deleteByExample(CourseCriteria example);

    int deleteByPrimaryKey(Integer courseId);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExample(CourseCriteria example);

    Course selectByPrimaryKey(Integer courseId);

    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseCriteria example);

    int updateByExample(@Param("record") Course record, @Param("example") CourseCriteria example);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}