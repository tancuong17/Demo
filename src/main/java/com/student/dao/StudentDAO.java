package com.student.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.student.model.Student;

@Repository
@Transactional
public class StudentDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public List<Student> getList() {
		Session session = sessionFactory.getCurrentSession();
		List<Student> list = session.createNativeQuery("select * from Student", Student.class).getResultList();
		return list;
	}
}
