package com.yjxxt.test;

import com.yjxxt.pojo.Dept;
import com.yjxxt.utils.SessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/*
    测试增删改
    事务:
        默认手动提交
 */
public class Class001_Test {
    public static void main(String[] args) throws IOException {
        //获取回话
        SqlSession session = SessionUtils.getSession();
        //执行sql
        //int rows = session.insert("com.yjxxt.mappers.DeptMapper.addDept");

        int rows = session.delete("com.yjxxt.mappers.DeptMapper.deleteDept",87);
        //得到结果处理结果
        if(rows>0){
            session.commit();
        }else{
            session.rollback();
        }
        //关闭回话
        session.close();
    }
}
