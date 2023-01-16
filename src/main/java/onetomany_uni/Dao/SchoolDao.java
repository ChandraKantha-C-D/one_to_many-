package onetomany_uni.Dao;

import java.sql.DriverManager;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import onetomany_uni_school.dto.School;
import onetomany_uni_school.dto.Student;

public class SchoolDao {
	
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		return entityManagerFactory.createEntityManager();
		}
	
	public void saveSchool(School school) {
		EntityManager entityManager= getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
		
		List<Student> students = school.getList();
		for(Student student : students) {
			entityManager.persist(student);
		}
		entityManager.persist(school);
		
		entityTransaction.commit();
		}
	
	public void updateSchool(int school_id , School school) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		School getSchool = entityManager.find(School.class, school_id);
		if(getSchool!=null) {
		entityTransaction.begin();
		school.setSchool_id(school_id);
		school.setList(getSchool.getList());
		
		entityManager.merge(school);
		
		entityTransaction.commit();
		
		}else {
			System.out.println("School not found");
		}
	}
	
	public void deleteSchool(int school_id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		School getSchool = entityManager.find(School.class, school_id);
		School school = new School();
		if(getSchool!=null) {
		entityTransaction.begin();
		school.setSchool_id(school_id);
		school.setList(getSchool.getList());
		
		entityManager.remove(school);
		
		
		entityTransaction.commit();
		
		}else {
			System.out.println("School not found");
		}
		}
	
	public School getSchoolById(int school_id) {
		EntityManager entityManager=getEntityManager();
		return entityManager.find(School.class, school_id);
			
	}
	
	public List<Student> getAllSchool() {
		EntityManager entityManager = getEntityManager();
		Query query =entityManager.createQuery("select s from School s");
		
		List<Student> list = query.getResultList();
		
		return list;
	}
	
	}


