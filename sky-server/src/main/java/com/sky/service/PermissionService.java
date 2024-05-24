package com.sky.service;

import com.sky.entity.Permission;

import java.util.List;

/**
 * Created by jinkun.tian on 2024/5/15
 */
public interface PermissionService {
    List<Permission> getPermissionsByEmployeeId(Long employeeId);
}
