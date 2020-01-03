package com.xulei.community.mapper;

import com.xulei.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    @Insert("insert into user(name,account_id,token,gmt_create,gmt_modified) " +
            "values(#{name},#{token},#{accountId},#{gmtCreate},#{gmtModified}) ")
    void insert(User user);

}
