package com.lagou.mapper;

import com.lagou.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


/**
 * @author Huw_Lin
 * time: 2022-09-27 03:35
 */
@Mapper
public interface CommentMapper {

    @Select("select * from t_comment where id = ${id}")
    public Comment findById(Integer id);
}
