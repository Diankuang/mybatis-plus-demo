package com.mybatisplusdemo.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统用户信息表
 * </p>
 *
 * @author jobob
 * @since 2019-05-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_sys_user")
public class TSysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private String userId;

    /**
     * 账户
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    private String userName;

    /**
     * 性别，1男，2女
     */
    private Integer gender;

    /**
     * 生日
     */
    private LocalDateTime birthday;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话
     */
    private String phone;

    /**
     * 角色ID
     */
    private String roleId;

    /**
     * 部门ID
     */
    private String deptId;

    /**
     * 状态，1有效用户，2删除，3冻结用户
     */
    private Integer status;

    /**
     * 用户类型，1内部用户， 2外部用户
     */
    private Integer userClass;

    /**
     * 用户级别，1,2,3,4
     */
    private Integer userLevel;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建者id
     */
    private String createBy;

    /**
     * 更新时间
     */
    private LocalDateTime modifyTime;

    /**
     * 修改者id
     */
    private String modifyBy;

    private String remark;


}
