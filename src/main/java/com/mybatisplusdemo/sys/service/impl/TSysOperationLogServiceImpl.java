package com.mybatisplusdemo.sys.service.impl;

import com.mybatisplusdemo.sys.entity.TSysOperationLog;
import com.mybatisplusdemo.sys.mapper.TSysOperationLogMapper;
import com.mybatisplusdemo.sys.service.ITSysOperationLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * sys操作日志表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-05-11
 */
@Service
public class TSysOperationLogServiceImpl extends ServiceImpl<TSysOperationLogMapper, TSysOperationLog> implements ITSysOperationLogService {

}
