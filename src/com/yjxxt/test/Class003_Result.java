package com.yjxxt.test;

import com.yjxxt.pojo.Emp;
import com.yjxxt.utils.SessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/*
    测试结果类型
 */
public class Class003_Result {
    public static void main(String[] args) throws IOException, ParseException {
        //获取回话
        SqlSession session = SessionUtils.getSession();
        //执行sql
        //int
        /*List<Integer> list1 = session.selectList("com.yjxxt.mappers.EmpMapper2.queryIdByNameLike","A");
        list1.forEach(System.out::println);*/

        //Date
        /*Date date = session.selectOne("com.yjxxt.mappers.EmpMapper2.queryDateById",7369);
        System.out.println(date);*/

        //Map
        //Map<String,Object> map = session.selectOne("com.yjxxt.mappers.EmpMapper2.queryMapById",7369);

        List<Map<String,Object>> list = session.selectList("com.yjxxt.mappers.EmpMapper2.queryMapBySal",Map.of("low",1000,"high",1500));

        list.forEach(System.out::println);

        //关闭回话
        session.close();
    }
}
