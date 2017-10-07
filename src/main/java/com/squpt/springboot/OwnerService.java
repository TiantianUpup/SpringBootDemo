package com.squpt.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hetiantian
 * 业务层
 */
@Service
public class OwnerService {
    @Autowired
    private OwnerMapper ownerMapper;

    public List<Owner> queryAllOwners() {
        List<Owner> ownerList = ownerMapper.queryAllOwners();

        if (ownerList == null || ownerList.size() == 0) {
            throw new MyException("没有查询到任何信息");
        }

        return ownerList;
    }

}
