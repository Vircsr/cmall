package com.csr.cmall.service;

import com.csr.cmall.dto.UmsAdminLoginParam;
import com.csr.cmall.dto.UmsAdminParam;
import com.csr.cmall.mbg.model.UmsAdmin;
import org.springframework.stereotype.Service;

/**
 * 后台管理员Service
 * Create by Chen on 2020/10/29
 */
@Service
public interface UmsAdminService {
    /**
     * 注册
     */
    UmsAdmin register(UmsAdminParam adminParam);
    /**
     * 登录
     */
    String login(UmsAdminLoginParam loginParam);
}
