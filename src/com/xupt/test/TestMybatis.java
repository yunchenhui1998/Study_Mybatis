package com.xupt.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.xupt.pojo.Category;
import com.xupt.pojo.Product;

public class TestMybatis {

	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=sqlSessionFactory.openSession();
        
//增
//        Category c=new Category();
//        c.setName("新增加的Category");
//        session.insert("addCategory",c);
//删     
//        Category c=new Category();
//        c.setId(2);
//        session.delete("deleteCategory",c);
//改
//        Category c=new Category();
//        c.setId(3);
//        c.setName("category3");
//        session.update("updateCategory",c);
//查
//        Category c=session.selectOne("getCategory",3);
//        System.out.println(c.getName());
//        listAll(session);
//        session.commit();
//        session.close();
	}
	private static void listAll(SqlSession session) {
		List<Category> cs=session.selectList("listCategory");
		for(Category c:cs) {
			System.out.println(c.getName());
		}
	}
}
