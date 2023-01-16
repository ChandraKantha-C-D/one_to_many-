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

public class StudentDao {
	
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		return entityManagerFactory.createEntityManager();
		}
	
	public void saveStudent(Student student) {
		EntityManager entityManager= getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
		
        entityManager.persist(student);
		
		entityTransaction.commit();
		}
	
	public void updateStudent(int student_id , Student student) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		Student getstudent = entityManager.find(Student.class, student_id);
		if(getstudent!=null) {
		entityTransaction.begin();
		student.setStudent_id(student_id);
		
		entityManager.merge(student);
		
		entityTransaction.commit();
		
		}else {
			System.out.println("Student not found");
		}
	}
	
	public void deleteStudent(int student_id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		Student getStudent = entityManager.find(Student.class, student_id);
		Student student = new Student();
		
		if(getStudent!=null) {
		entityTransaction.begin();
		
		//student.setStudent_id(student_id);
		entityManager.remove(getStudent);
		
		entityTransaction.commit();
		System.out.println("Deleted");
		
		}else {
			System.out.println("Students not found");
		}
		}
	
	public Student getStudentById(int student_id) {
		EntityManager entityManager=getEntityManager();
		return entityManager.find(Student.class, student_id);
			
	}
	
	public List<Student> getAllStudent() {
		EntityManager entityManager = getEntityManager();
		Query query =entityManager.createQuery("select s from School s");
		
		List<Student> list = query.getResultList();
		
		return list;
	}
	
	}



