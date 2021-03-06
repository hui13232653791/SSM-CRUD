package com.atguigu.ssm.dao;

import java.util.List;

import com.atguigu.ssm.bean.Employee;
import com.atguigu.ssm.bean.EmployeeExample;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    long countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(Employee record);

    int insertSelective(Employee record);

    /**
     * 选择查询（不带部门名称）
     */
    List<Employee> selectByExample(EmployeeExample example);

    /**
     * 根据主键查询（不带部门名称）
     */
    Employee selectByPrimaryKey(Integer empId);

    /**
     * 选择查询（含部门名称）
     */
    List<Employee> selectByExampleWithDept(EmployeeExample example);

    /**
     * 根据主键查询（含部门名称）
     */
    Employee selectByPrimaryKeyWithDept(Integer empId);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}