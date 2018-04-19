package com.sptpc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sptpc.domain.Student;
import com.sptpc.persistence.StudentMapper;

@Service
public class StudentService {
	@Autowired
	private StudentMapper studentMapper;
	
	//得到所有的学生信息
	public List<Student> getAllStudent(){		
		return studentMapper.getAllStudent();
	}

	//插入学生的信息
	public int saveStudent(Student student){
		return studentMapper.insertStudent(student);
	}
	
	//根据学生ID得到学生信息
	public Student getStudentByID(String id) {
		return studentMapper.findStudentByID(Integer.parseInt(id));
	}

	//更新学生信息
	public int updateStudent(Student student) {
		
		return studentMapper.updateStudent(student);
	}

	//根据学生ID删除学生信息

	//根据学生ID删除学生选课信息
	public int deleteStudentID(String id) {
		int n = studentMapper.deleteStuCourseByID(Integer.parseInt(id));
		return studentMapper.deleteStudentByID(Integer.parseInt(id));
//		if (n==0){
//			return 0;
//		}else{
//			return studentMapper.deleteStudentByID(Integer.parseInt(id));
//		}
		
	}
	
}
