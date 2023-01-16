package onetomany_uni_school.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int school_id;
	private String school_name;
	private String school_gst;
	@OneToMany
	private List<Student> list;
	public int getSchool_id() {
		return school_id;
	}
	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public String getSchool_gst() {
		return school_gst;
	}
	public void setSchool_gst(String school_gst) {
		this.school_gst = school_gst;
	}
	public List<Student> getList() {
		return list;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "School [school_id=" + school_id + ", school_name=" + school_name + ", school_gst=" + school_gst
				+ ", list=" + list + "]";
	}
	
	

}
