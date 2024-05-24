package com.sky.mapper;

import org.apache.ibatis.annotations.*;
import com.sky.entity.Menu;
import java.util.List;
/**
 * Created by jinkun.tian on 2024/5/14
 */
@Mapper
public interface MenuMapper {

    @Select("SELECT * FROM menu")
    List<Menu> getAllMenus();

    @Select("SELECT * FROM menu WHERE id = #{id}")
    Menu getMenuById(Long id);

    @Insert("INSERT INTO menu (name, title, icon, badge, target, path, component, renderMenu, parent, permission, cacheable, link) " +
            "VALUES (#{name}, #{title}, #{icon}, #{badge}, #{target}, #{path}, #{component}, #{renderMenu}, #{parent}, #{permission}, #{cacheable}, #{link})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertMenu(Menu menu);

    @Update("UPDATE menu SET name = #{name}, title = #{title}, icon = #{icon}, badge = #{badge}, target = #{target}, path = #{path}, component = #{component}, " +
            "renderMenu = #{renderMenu}, parent = #{parent}, permission = #{permission}, cacheable = #{cacheable}, link = #{link} WHERE id = #{id}")
    int updateMenu(Menu menu);

    @Delete("DELETE FROM menu WHERE id = #{id}")
    int deleteMenu(Long id);

    @Select("SELECT m.* FROM menu m " +
            "JOIN role_menu rm ON m.id = rm.menu_id " +
            "JOIN employee_role er ON rm.role_id = er.role_id " +
            "WHERE er.employee_id = #{employeeId}")
    List<Menu> getMenusByEmployeeId(Long employeeId);
}
