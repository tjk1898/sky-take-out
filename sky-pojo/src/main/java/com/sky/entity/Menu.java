package com.sky.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jinkun.tian on 2024/5/14
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private Long id;
    private String name;
    private String title;
    private String icon;
    private String badge;
    private String target;
    private String path;
    private String component;
    private Boolean renderMenu;
    private String parent;
    private String permission;
    private Boolean cacheable;
    private String link;
}
