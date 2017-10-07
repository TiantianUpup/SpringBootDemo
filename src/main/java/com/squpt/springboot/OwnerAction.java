package com.squpt.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author hetiantian
 * 控制层
 */
@Controller
public class OwnerAction {
    @Autowired
    private OwnerService ownerService;

    @RequestMapping("/queryAllOwners")
    @ResponseBody
    public List<Owner> queryAllOwners() {
        return ownerService.queryAllOwners();
    }
}
