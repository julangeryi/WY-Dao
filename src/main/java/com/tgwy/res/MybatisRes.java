package com.tgwy.res;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class MybatisRes {
	
	private SqlSession session;
	
	public MybatisRes(){
		String resource = "configuration.xml";
		InputStream is = MybatisRes.class.getClassLoader().getResourceAsStream(resource);
		// 构建sqlSession的工厂
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		session = sessionFactory.openSession();
	}

	public SqlSession getSession(){
		return session;
	}
}
