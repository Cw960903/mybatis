package com.yjxxt.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/*
    对SqlSession封装
 */
public class SessionUtils {
    private static SqlSessionFactory factory = null;

    static{
        try {
            factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSession(){
        SqlSession session = null;
        if(factory!=null) {
            session = factory.openSession(); //默认手动 提交事务
            //session = factory.openSession(true); //设置自动 提交事务
        }
        return  session;
    }
}
