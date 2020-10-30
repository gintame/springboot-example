package com.it.controller;

import com.it.dao.DepartmentDao;
import com.it.dao.EmployeeDao;
import com.it.entities.Department;
import com.it.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String getdepartments(Model model) {
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String join(Employee employee) {

//        if ()
        System.out.println(employee);
//        employeeDao.save(employee);
//
        return "redirect:/emps";
    }


    @GetMapping("emp/{id}")
    public String getWantedEmployee(
            @PathVariable("id") Integer id,
            Model model) {
        Employee employee = employeeDao.get(id);
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);

        if (employee != null) {
            model.addAttribute("emp", employee);
            return "emp/add";
        }
        throw new RuntimeException("查无此人");
    }

    @PutMapping("/emp")
    public String updateEmployee(Employee employee) {
        if (employee != null) {
            System.out.println("---------------");
            employeeDao.save(employee);
            return "redirect:/emps";
        }
        throw new RuntimeException("修改信息发生错误");
    }

    //员工删除
    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/emps";
    }

    @RequestMapping("/myServlet")
    public String ser() {
        System.out.println("controller=-----");
        return "emps";
    }
}
