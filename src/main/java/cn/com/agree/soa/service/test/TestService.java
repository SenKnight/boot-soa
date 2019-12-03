package cn.com.agree.soa.service.test;

import cn.com.agree.soa.mapper.UserMapper;
import cn.com.agree.soa.model.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>Descriptions...
 *
 * @author Johnson
 * @date 2019/11/28.
 */
@Service
@Transactional
public class TestService implements ITestService {
    
    @Autowired
    private UserMapper userMapper;
    
    @Override
    public List<UserDO> listUser() {
        return userMapper.list();
    }
    
}
