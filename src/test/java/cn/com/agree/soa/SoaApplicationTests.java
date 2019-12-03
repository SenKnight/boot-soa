package cn.com.agree.soa;

import cn.com.agree.soa.mapper.UserMapper;
import cn.com.agree.soa.model.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class SoaApplicationTests {
    
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Autowired
    private UserMapper userMapper;

    @Test
    void insertUser() {
        UserDO userDO = new UserDO();
        userDO.setUserId(System.currentTimeMillis()+"");
        userDO.setUserName("蒋森");
        userDO.setUserCode("jiangsen");
        userDO.setUserPhone("131230909");
        userDO.setPassword("123456ss.");
        userDO.setUserAge(26);
        log.info(userDO.toString());
        userMapper.insert(userDO);
    }
    
    @Test
    void deleteUser(){
        userMapper.deleteById("1575016776586");
    }
    
    @Test
    void selectById(){
        UserDO userDO = userMapper.getById("1575016776586");
        log.info(userDO.toString());
    }
    
    @Test
    void selectAll(){
        List<UserDO> users = userMapper.list();
        log.info(users.toString());
    }
    
    @Test
    void setSqlSessionFactory(){
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper testMapper = session.getMapper(UserMapper.class);
        
    }

}
