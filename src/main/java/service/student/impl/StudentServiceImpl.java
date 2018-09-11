package service.student.impl;

import business.StudentBusiness;
import model.Students;
import service.student.StudentService;

import java.util.List;

/**
 * 
 */
public class StudentServiceImpl implements StudentService {

	public List<Students> getAllStudents() {
		// TODO Auto-generated method stub
		return StudentBusiness.getAllStudents();
	}

}
