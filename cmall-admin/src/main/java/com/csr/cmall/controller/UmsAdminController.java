package com.csr.cmall.controller;

import com.csr.cmall.common.api.Result;
import com.csr.cmall.dto.UmsAdminLoginParam;
import com.csr.cmall.dto.UmsAdminParam;
import com.csr.cmall.mbg.model.UmsAdmin;
import com.csr.cmall.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 后台用户管理
 * Create by Chen on 2020/11/3
 */
@RestController
@Api(value = "UmsAdminController",tags = "用户后台登录")
@RequestMapping("/admin")
public class UmsAdminController {
    @Resource
    private UmsAdminService adminService;

    @PostMapping("/login")
    @ApiOperation(value = "用户登录")
    public Result login(@Validated @RequestBody UmsAdminLoginParam loginParam) {
        String token = adminService.login(loginParam);
        if (token == null) {
            return Result.failed("用户名或密码错误");
        }
        return Result.success(token);
    }

    @PostMapping("/register")
    @ApiOperation(value = "用户注册")
    public Result<UmsAdmin> register(@Validated @RequestBody UmsAdminParam adminParam) {
        UmsAdmin admin = adminService.register(adminParam);
        if (admin == null) {
            return Result.validateFailed("用户名已存在");
        }
        return Result.success(admin);
    }

}
