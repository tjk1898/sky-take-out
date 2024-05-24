package com.sky.mapper;

import com.sky.entity.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by jinkun.tian on 2024/5/15
 */
@Mapper
public interface PermissionMapper {
    @Select("SELECT p.* FROM permission p " +
            "JOIN role_permission rp ON p.id = rp.permission_id " +
            "JOIN employee_role er ON rp.role_id = er.role_id " +
            "WHERE er.employee_id = #{employeeId}")
    List<Permission> getPermissionsByEmployeeId(Long employeeId);
}
