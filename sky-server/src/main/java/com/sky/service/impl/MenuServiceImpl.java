package com.sky.service.impl;

import com.sky.entity.Menu;
import com.sky.mapper.MenuMapper;
import com.sky.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jinkun.tian on 2024/5/14
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getAllMenus() {
        return menuMapper.getAllMenus();
    }

    @Override
    public Menu getMenuById(Long id) {
        return menuMapper.getMenuById(id);
    }

    @Override
    public boolean createMenu(Menu menu) {
        return menuMapper.insertMenu(menu) > 0;
    }

    @Override
    public boolean updateMenu(Menu menu) {
        return menuMapper.updateMenu(menu) > 0;
    }

    @Override
    public boolean deleteMenu(Long id) {
        return menuMapper.deleteMenu(id) > 0;
    }

    @Override
    public List<Menu> getMenusByEmployeeId(Long employeeId) {
        return menuMapper.getMenusByEmployeeId(employeeId);
    }
}
