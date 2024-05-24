package com.sky.mapper;

import com.sky.entity.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by jinkun.tian on 2024/5/14
 */
@Mapper
public interface RoleMapper {

    @Select("SELECT * FROM role")
    List<Role> getAllRoles();

    @Select("SELECT * FROM role WHERE id = #{id}")
    Role getRoleById(Long id);

    @Insert("INSERT INTO role (name) VALUES (#{name})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertRole(Role role);

    @Update("UPDATE role SET name = #{name} WHERE id = #{id}")
    int updateRole(Role role);

    @Delete("DELETE FROM role WHERE id = #{id}")
    int deleteRole(Long id);

    @Select("SELECT r.* FROM role r " +
            "JOIN employee_role er ON r.id = er.role_id " +
            "WHERE er.employee_id = #{employeeId}")
    List<Role> getRolesByEmployeeId(Long employeeId);
}
