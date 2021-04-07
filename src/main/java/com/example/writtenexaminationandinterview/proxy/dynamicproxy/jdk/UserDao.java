package com.example.writtenexaminationandinterview.proxy.dynamicproxy.jdk;

/**
 * @author Duan Xiangqing
 * @version 1.0
 * @date 2021/4/7 2:28 下午
 */
public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("保存数据");
    }
}
