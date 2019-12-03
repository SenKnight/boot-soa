package cn.com.agree.soa.model;

import java.util.Objects;

/**
 * <p>Descriptions...
 *
 * @author Johnson
 * @date 2019/11/28.
 */
public class UserDO {
    private String userId;
    private String userName;
    private String userCode;
    private String password;
    private String userPhone;
    private Integer userAge;
    
    public UserDO() {
    }
    
    public UserDO(String userId, String userName, String userCode, String password, String userPhone, Integer userAge) {
        this.userId = userId;
        this.userName = userName;
        this.userCode = userCode;
        this.password = password;
        this.userPhone = userPhone;
        this.userAge = userAge;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public UserDO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public UserDO setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    
    public String getUserCode() {
        return userCode;
    }
    
    public UserDO setUserCode(String userCode) {
        this.userCode = userCode;
        return this;
    }
    
    public String getPassword() {
        return password;
    }
    
    public UserDO setPassword(String password) {
        this.password = password;
        return this;
    }
    
    public String getUserPhone() {
        return userPhone;
    }
    
    public UserDO setUserPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }
    
    public Integer getUserAge() {
        return userAge;
    }
    
    public UserDO setUserAge(Integer userAge) {
        this.userAge = userAge;
        return this;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDO appUserDO = (UserDO) o;
        return Objects.equals(userId, appUserDO.userId) &&
                       Objects.equals(userName, appUserDO.userName) &&
                       Objects.equals(userCode, appUserDO.userCode) &&
                       Objects.equals(password, appUserDO.password) &&
                       Objects.equals(userPhone, appUserDO.userPhone) &&
                       Objects.equals(userAge, appUserDO.userAge);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userCode, password, userPhone, userAge);
    }
    
    
    /**
     * toString
     */
    @Override
    public String toString() {
        return "UserDO{" +
                       "userId='" + userId + '\'' +
                       ", userName='" + userName + '\'' +
                       ", userCode='" + userCode + '\'' +
                       ", password='" + password + '\'' +
                       ", userPhone='" + userPhone + '\'' +
                       ", userAge=" + userAge +
                       '}';
    }
}
