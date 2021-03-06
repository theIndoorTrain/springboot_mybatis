package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xm.pojo.Student;

public interface StudentMapper {

	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public Student getById(Integer id);
	
	/**
	 * 查询全部
	 * @return
	 */
	public List<Student> list();
	
	/**
	 * 插入
	 * @param student
	 */
	public int insert(Student student);
	/**
	 * 主键回填的插入
	 * @param student
	 * @return
	 */
	public int insertToId(Student student);
	
	/**
	 * 根据student的id修改
	 * @param student
	 */
	public void update(Student student);
	
	/**
	 * 根据id删除
	 * @param id
	 */
	public void delete(Integer id);
	
	/**
	 * 根据id查询所有的书
	 * @param id
	 */
	public Student selectBookById(Integer id);
	/**
	 * 根据学生id查询该学生选修的所有课程
	 * @param id
	 * @return
	 */
	public Student selectCourseById(Integer id);
	/**
	 * 根据name查询
	 * @param name
	 * @return
	 */
	public Student getByName(String name);
	
	/**
	 * 根据用户名和id同时查询
	 * @param id
	 * @param name
	 * @return
	 */
	public Student getStudentByIdAndName(@Param("id")Integer id,@Param("name")String name);
	
	/**
	 * 根据用户名和id同时查询
	 * @param id
	 * @param name
	 * @return
	 */
	public Student getStudentByIdAndName(Student student);
	
}
