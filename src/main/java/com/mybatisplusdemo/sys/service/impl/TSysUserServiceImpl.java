package com.mybatisplusdemo.sys.service.impl;

import com.mybatisplusdemo.sys.entity.TSysUser;
import com.mybatisplusdemo.sys.mapper.TSysUserMapper;
import com.mybatisplusdemo.sys.service.ITSysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户信息表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-05-10
 */
@Service
public class TSysUserServiceImpl extends ServiceImpl<TSysUserMapper, TSysUser> implements ITSysUserService {

}
