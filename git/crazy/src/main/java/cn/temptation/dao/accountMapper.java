package cn.temptation.dao;

import cn.temptation.domain.account;

public interface accountMapper {
    int insert(account record);

    int insertSelective(account record);
}