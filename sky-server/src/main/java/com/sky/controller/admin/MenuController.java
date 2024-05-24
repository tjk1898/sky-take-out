package com.sky.controller.admin;

import com.sky.entity.Menu;
import com.sky.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jinkun.tian on 2024/5/14
 */
@RestController
@RequestMapping("/admin/menus")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    @GetMapping("/{id}")
    public Menu getMenuById(@PathVariable Long id) {
        return menuService.getMenuById(id);
    }

    @PostMapping
    public boolean createMenu(@RequestBody Menu menu) {
        return menuService.createMenu(menu);
    }

    @PutMapping("/{id}")
    public boolean updateMenu(@PathVariable Long id, @RequestBody Menu menu) {
        menu.setId(id);
        return menuService.updateMenu(menu);
    }

    @DeleteMapping("/{id}")
    public boolean deleteMenu(@PathVariable Long id) {
        return menuService.deleteMenu(id);
    }

    @GetMapping("/employee/{employeeId}")
    public List<Menu> getMenusByEmployeeId(@PathVariable Long employeeId) {
        return menuService.getMenusByEmployeeId(employeeId);
    }
}
