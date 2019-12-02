package com.yiguozhidu.demo.mapper;

        import com.yiguozhidu.demo.entity.User;
        import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    void insertUser(String username, String password);

    User selectUser(String username, String password);
    boolean removeUserByname(String username);
}
