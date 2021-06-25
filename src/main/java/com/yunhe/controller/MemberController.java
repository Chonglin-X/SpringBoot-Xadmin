package com.yunhe.controller;

import com.yunhe.entity.AjaxDone;
import com.yunhe.mapper.DepartmentMapper;
import com.yunhe.mapper.EmployeeMapper;
import com.yunhe.pojo.Department;
import com.yunhe.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MemberController {


    @Autowired
    private EmployeeMapper employeeMapper;
    private DepartmentMapper departmentMapper;


    @RequestMapping("/member")
    public String member(Model model){
        ArrayList<Employee> employees = employeeMapper.selectAllEmployee();
        model.addAttribute("members",employees);
        return  "member-list";
    }

    // 去添加页面
    @GetMapping("/addMember")
    public String addMember(Model model){
        return "member-add";
    }

    // 添加员工
    @RequestMapping("/addMember")
    @ResponseBody
    public AjaxDone toaddMember(Employee employee){
        employeeMapper.addOneEmployee(employee);
        return new AjaxDone(200,"添加成功！");
    }
    //员工修改页面
    @GetMapping("/edit/{id}")
    public String memberedit(@PathVariable("id")Integer id,Model model){
        Employee employees = employeeMapper.selectByIDEmployee(id);
        model.addAttribute("edit",employees);
        return "member-edit";
    }

    @PostMapping("/updateEmp")
    @ResponseBody
    public AjaxDone membereditpost(Employee employee){
            System.out.println(employee);
            employeeMapper.addOneEmployee(employee);
            return new AjaxDone(200,"修改成功！");
        }

    //删除员工
    @GetMapping("/del/{id}")
    public String del(@PathVariable("id")Integer id){
        employeeMapper.deleteByIDEmployee(id);
        return "redirect:/member";
    }
}
