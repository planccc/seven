package com.sptpc.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sptpc.domain.Student;

@Repository
public interface StudentMapper {
	public List<Student> getAllStudent();
	
	//插入学生信息
	public int insertStudent(Student student);
	
	//根据ID找学生
	public Student findStudentByID(int id);

	//更新学生信息
	public int updateStudent(Student student);

	//根据ID删除学生信息
	public int deleteStudentByID(int id);
	
	public int deleteStuCourseByID(int id);
}
