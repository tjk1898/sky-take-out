package com.sky.service.impl;

import com.sky.entity.Permission;
import com.sky.mapper.PermissionMapper;
import com.sky.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jinkun.tian on 2024/5/15
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> getPermissionsByEmployeeId(Long employeeId) {
        return permissionMapper.getPermissionsByEmployeeId(employeeId);
    }
}
