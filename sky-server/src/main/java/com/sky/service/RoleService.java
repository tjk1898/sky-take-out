package com.sky.service;

import com.sky.entity.Role;

import java.util.List;

/**
 * Created by jinkun.tian on 2024/5/14
 */
public interface RoleService {
    List<Role> getAllRoles();

    Role getRoleById(Long id);

    boolean createRole(Role role);

    boolean updateRole(Role role);

    boolean deleteRole(Long id);

    List<Role> getRolesByEmployeeId(Long employeeId);
}
