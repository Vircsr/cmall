package com.csr.cmall.service.impl;

import com.csr.cmall.dto.UmsAdminLoginParam;
import com.csr.cmall.dto.UmsAdminParam;
import com.csr.cmall.mbg.mapper.UmsAdminMapper;
import com.csr.cmall.mbg.model.UmsAdmin;
import com.csr.cmall.mbg.model.UmsAdminExample;
import com.csr.cmall.service.UmsAdminService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * TODO
 * Create by Chen on 2020/11/3
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    @Resource
    private UmsAdminMapper adminMapper;

    @Override
    public UmsAdmin register(UmsAdminParam adminParam) {
        UmsAdmin admin = new UmsAdmin();
        BeanUtils.copyProperties(adminParam, admin);
        admin.setCreateTime(new Date());
        admin.setStatus(1);
//        同名用户检测
        UmsAdminExample adminExample = new UmsAdminExample();
        adminExample.createCriteria().andUsernameEqualTo(admin.getUsername());
        List<UmsAdmin> adminList = adminMapper.selectByExample(adminExample);
        if (adminList.size() > 0) {
            return null;
        }
        adminMapper.insert(admin);
        return admin;
    }

    @Override
    public String login(UmsAdminLoginParam loginParam) {
        UmsAdmin admin = new UmsAdmin();
        BeanUtils.copyProperties(loginParam, admin);
        UmsAdminExample adminExample = new UmsAdminExample();
        adminExample.createCriteria().andUsernameEqualTo(admin.getUsername()).andPasswordEqualTo(admin.getPassword()).andStatusEqualTo(1);
        List<UmsAdmin> adminList = adminMapper.selectByExample(adminExample);
        switch (adminList.size()) {
            case 1:
                return "success";
            default:
                return null;
        }
    }
}
