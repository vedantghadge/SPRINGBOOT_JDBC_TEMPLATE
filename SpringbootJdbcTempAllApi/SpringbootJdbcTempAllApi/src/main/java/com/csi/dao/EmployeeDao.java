package com.csi.dao;

import com.csi.model.Employee;

import java.util.List;

public interface EmployeeDao {

    public void signUp(Employee employee);

    public boolean signIn(String empEmailId, String empPassword);

    public void saveAllData(List<Employee> employeeList);

    public List<Employee> getAllData();

    public List<Employee> getDataByName(String empName);

    public Employee getDataById(int empId);

    public List<Employee> getDataByEmailId(String empEmailId);

    public List<Employee> getDataByContactNumber(long empContactNumber);

    public List<Employee> getDataByDOB(String empDOB);

    public List<Employee> getDataByUsingAnyInput(String input);

    public List<Employee> sortById();

    public List<Employee> sortByName();

    public List<Employee> sortByDOB();

    public List<Employee> sortBySalary();

    public List<Employee> filterDataBySalary(double empSalary);

    public boolean checkLoanEligibilty(int empId);

    public void updateData(int empId, Employee employee);

    public void partialUpdation(int empId, Employee employee);

    public void deleteDataById(int empId);

    public void deleteAllData();


}
