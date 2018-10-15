package cn.temptation.dao;

import cn.temptation.domain.func;

public interface funcMapper {
    int deleteByPrimaryKey(String name);

    int insert(func record);

    int insertSelective(func record);

    func selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(func record);

    int updateByPrimaryKey(func record);
}