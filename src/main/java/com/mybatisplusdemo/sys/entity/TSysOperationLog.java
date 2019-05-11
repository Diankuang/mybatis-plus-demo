package com.mybatisplusdemo.sys.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * sys操作日志表
 * </p>
 *
 * @author jobob
 * @since 2019-05-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_sys_operation_log")
public class TSysOperationLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日志类型
     */
    private String logType;

    /**
     * 日志名称
     */
    private String logName;

    /**
     * 操作员ID
     */
    private String userId;

    /**
     * 操作类名称
     */
    private String className;

    /**
     * 操作方法
     */
    private String method;

    /**
     * 状态，1成功，2失败，3回退
     */
    private Integer status;

    private LocalDateTime createTime;

    /**
     * 操作详情
     */
    private String msg;


}
