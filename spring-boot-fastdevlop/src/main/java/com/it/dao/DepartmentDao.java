package com.it.dao;

import com.it.entities.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class DepartmentDao {

	private static Map<Integer, Department> departments = null;

    /**
     * 使用静态代码块向集合中添加元素，模拟数据库中的表信息
     */
	static{
		departments = new HashMap<Integer, Department>();
		
		departments.put(101, new Department(101, "D-AA"));
		departments.put(102, new Department(102, "D-BB"));
		departments.put(103, new Department(103, "D-CC"));
		departments.put(104, new Department(104, "D-DD"));
		departments.put(105, new Department(105, "D-EE"));
	}

    /**
     * 获取全部部门
     * @return
     */
	public Collection<Department> getDepartments(){
		return departments.values();
	}

    /**
     * 根据id获取部门
     * @param id
     * @return
     */
	public Department getDepartment(Integer id){
		return departments.get(id);
	}
	
}
