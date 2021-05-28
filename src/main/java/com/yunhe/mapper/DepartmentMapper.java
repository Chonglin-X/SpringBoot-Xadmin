package com.yunhe.mapper;

import com.yunhe.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface DepartmentMapper {
//    获取部门信息
    List<Department> selectAllDepartment();
//    通过id获取部门
    String selectByIdDepartment(Integer id);




}
