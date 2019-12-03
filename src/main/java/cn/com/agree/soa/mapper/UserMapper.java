package cn.com.agree.soa.mapper;

import cn.com.agree.soa.model.UserDO;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * <p>Descriptions...
 *
 * @author Johnson
 * @date 2019/11/29.
 */
@Mapper
@Repository
public interface UserMapper {
    
//    @Insert("insert into user (id, name, code, password, phone, age) values (#{userId}, #{userName}, #{userCode}, #{password}, #{userPhone}, #{userAge})")
    void insert(UserDO userDO);
    
    @Delete("delete from user where id=#{id}")
    void deleteById(String id);
    
    @Select("select * from user where id=#{id}")
    UserDO getById(String id);
    
//    @Select("select * from user")
    List<UserDO> list();
    
    @Update("update user set phone=#{userPhone} where id=#{userId}")
    void update(UserDO userDO);
}
