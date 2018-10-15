package cn.temptation.dao;

import cn.temptation.domain.users;

public interface usersMapper {
    int insert(users record);

    int insertSelective(users record);
}