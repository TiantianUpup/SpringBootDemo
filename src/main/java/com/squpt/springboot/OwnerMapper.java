package com.squpt.springboot;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @aurhor hetiantian
 * 数据化持久层接口
 */
@Repository
@Mapper
public interface OwnerMapper {
    /**
     * 查询出所有的owner
     * @return
     * */
    @Select("select * from owner")
    List<Owner> queryAllOwners();
}
