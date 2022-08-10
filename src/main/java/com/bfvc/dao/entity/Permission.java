package com.bfvc.dao.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description:
 * @author: Wenzer
 * @date: 2022-08-09 下午 05:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Permission {
    public static final String MENU_TYPE_CATALOGUE = "C";
    public static final String MENU_TYPE_MENU = "M";
    public static final String MENU_TYPE_BUTTON = "B";

    private static final long serialVersionUID = 1L;
    /**
     * 自增主键
     */
    private Integer id;
    /**
     * 权限标识字符串
     */
    private String perms;
    /**
     * 操作描述(名称)
     */
    private String description;
    /**
     * 所属父菜单的id
     */
    private Integer parent_id;
    /**
     * 操作类型(C目录,M菜单,B按钮)
     */
    private String menuType;
    /**
     * 是否可见(1可见，0不可见，默认可见)
     */
    private Integer visible;
    /**
     * 操作对应的url
     */
    private String url;
    /**
     * 权限状态标识(1可用,0不可用，其余待规划)
     */
    private Integer menuStatus;
    /**
     * 删除标识
     */
    @TableField(fill = FieldFill.INSERT)
    @TableLogic
    private Integer delFlag;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 该条记录的版本信息
     */
    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;

}
