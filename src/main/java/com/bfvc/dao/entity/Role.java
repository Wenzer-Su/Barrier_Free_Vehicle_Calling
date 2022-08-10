package com.bfvc.dao.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description:
 * @author: Wenzer
 * @date: 2022-08-09 下午 07:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Role {
    private static final long serialVersionUID = 1L;
    /**
     * 自增主键
     */
    private Integer id;
    /**
     * 角色名称也是角色的关键字
     */
    private String roleName;
    /**
     * 聚合该角色所具有的权限id
     */
    private String permissions;
    /**
     * 角色状态(1表示可用，0表示不可用，其他状态待规划)
     */
    private Integer roleStatus;
    /**
     * 角色信息删除标识
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
     * 该条记录的备注信息
     */
    private String remarks;

    /**
     * 该条记录的版本信息
     */
    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;


}
