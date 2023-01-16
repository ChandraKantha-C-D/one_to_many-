package onetomany_uni_school.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import onetomany_uni.Dao.SchoolDao;
import onetomany_uni.Dao.StudentDao;
import onetomany_uni_school.dto.School;
import onetomany_uni_school.dto.Student;

public class SchoolMain {

	public static void main(String[] args) {
//		Student student1 = new Student();
//		student1.setStudent_name("Ram");
//		student1.setStudent_father_name("ranan");
//		student1.setStudent_address("Banglore");
//		
//		Student student2 = new Student();
//		student2.setStudent_name("Kirshna");
//		student2.setStudent_father_name("Gagan");
//		student2.setStudent_address("Ckm");
//		
//		Student student3 = new Student();
//		student3.setStudent_name("Anup");
//		student3.setStudent_father_name("Goutham");
//		student3.setStudent_address("Ckm");
//		
//		List<Student> list = new ArrayList<Student>();
//		list.add(student1);
//		list.add(student2);
//		list.add(student3);
//		
//		School school = new School();
//		school.setSchool_name("Vasavi");
//		school.setSchool_gst("ABC123");
//		school.setList(list);
//		
//		SchoolDao dao = new SchoolDao();
//		dao.saveSchool(school);
		
//		School school = new School();
//		school.setSchool_name("Vasavi Vidyalay");
//		school.setSchool_gst("ABC123");
//		
//		
//		SchoolDao dao = new SchoolDao();
//		dao.updateSchool(1,school);
		
//		SchoolDao dao = new SchoolDao();
//		dao.deleteSchool(1);
		
		
//		SchoolDao dao = new SchoolDao();
//		System.out.println( dao.getSchoolById(1));
		
		
//		SchoolDao dao = new SchoolDao();
//		System.out.println( dao.getAllSchool());
		
//		Student student = new Student();
//		student.setStudent_father_name("Danjay");
//		student.setStudent_address("hebbal");
//		student.setStudent_name("Varun");
//		
//		StudentDao dao = new StudentDao();
//		dao.saveStudent(student);
		
		StudentDao dao = new StudentDao();
		dao.deleteStudent(4);
		//System.out.println(dao.getStudentById(2));
		
		//EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vinod");

	}

}
