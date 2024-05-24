package com.sky.service.impl;

import com.sky.entity.Role;
import com.sky.mapper.RoleMapper;
import com.sky.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jinkun.tian on 2024/5/14
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getAllRoles() {
        return roleMapper.getAllRoles();
    }

    @Override
    public Role getRoleById(Long id) {
        return roleMapper.getRoleById(id);
    }

    @Override
    public boolean createRole(Role role) {
        return roleMapper.insertRole(role) > 0;
    }

    @Override
    public boolean updateRole(Role role) {
        return roleMapper.updateRole(role) > 0;
    }

    @Override
    public boolean deleteRole(Long id) {
        return roleMapper.deleteRole(id) > 0;
    }

    @Override
    public List<Role> getRolesByEmployeeId(Long employeeId) {
        return roleMapper.getRolesByEmployeeId(employeeId);
    }
}
