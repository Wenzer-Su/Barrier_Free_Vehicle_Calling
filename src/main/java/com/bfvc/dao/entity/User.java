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
 * @date: 2022-08-09 下午 08:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {
    private static final long serialVersionUID = 1L;

    /**
     * 自增主键
     */
    private Integer id;
    /**
     * 登录用的用户名
     */
    private String userName;
    /**
     * 登录密码
     */
    private String password;

    /**
     * 用于显示的用户名
     */
    private String nickName;

    /**
     * 该用户所对应的角色id
     */
    private Integer roleId;

    /**
     * 用户在职状态标记(1表示在职，0表示离职，其余待规划)
     */
    private Integer staffStatus;

    /**
     * 账号删除标识
     */
    @TableField(fill = FieldFill.INSERT)
    @TableLogic
    private Integer delFlag;

    /**
     * 账号创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 账号信息更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 该用户的相关描述
     */
    private String remarks;

    /**
     * 该条记录的版本信息
     */
    @TableField(fill = FieldFill.INSERT)
    @Version
    private Integer version;


}
