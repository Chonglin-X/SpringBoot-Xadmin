package com.yunhe.mapper;

import com.yunhe.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

//员工
@Mapper
@Repository
public interface EmployeeMapper {

    //增加一个员工
    int addOneEmployee(Employee employee);
    //查询全部员工
    ArrayList<Employee> selectAllEmployee();
    //通过id查询员工
    Employee selectByIDEmployee(Integer id);
    //通过id删除一个员工
    int deleteByIDEmployee(Integer id);

}

