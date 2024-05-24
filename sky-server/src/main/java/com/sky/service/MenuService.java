package com.sky.service;

import com.sky.entity.Menu;

import java.util.List;

/**
 * Created by jinkun.tian on 2024/5/14
 */
public interface MenuService {
    List<Menu> getAllMenus();
    Menu getMenuById(Long id);
    boolean createMenu(Menu menu);
    boolean updateMenu(Menu menu);
    boolean deleteMenu(Long id);
    List<Menu> getMenusByEmployeeId(Long employeeId);
}
