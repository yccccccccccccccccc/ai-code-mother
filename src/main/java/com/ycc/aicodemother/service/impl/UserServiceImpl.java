package com.ycc.aicodemother.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.ycc.aicodemother.model.entity.User;
import com.ycc.aicodemother.mapper.UserMapper;
import com.ycc.aicodemother.service.UserService;
import org.springframework.stereotype.Service;

/**
 *  服务层实现。
 *
 * @author ycc
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>  implements UserService {

}
