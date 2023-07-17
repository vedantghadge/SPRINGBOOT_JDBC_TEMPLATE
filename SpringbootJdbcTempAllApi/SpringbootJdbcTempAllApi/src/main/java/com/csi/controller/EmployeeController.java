package com.csi.controller;

import com.csi.exception.RecorNotFoundException;
import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeServiceImpl;

    @PostMapping("/signup")
    public ResponseEntity<String> signUP(@RequestBody Employee employee) {
        employeeServiceImpl.signUp(employee);
        return ResponseEntity.ok("Sign up done Successfully");
    }

    @PostMapping("/savealldata")
    public ResponseEntity<String> saveAllData(@RequestBody List<Employee> employeeList) {
        employeeServiceImpl.saveAllData(employeeList);

        return ResponseEntity.ok("All Data Saved Successfully");
    }

    @GetMapping("signin/{empEmailId}/{empPassword}")
    public ResponseEntity<Boolean> signIn(@PathVariable String empEmailid, @PathVariable String empPassword) {

        return ResponseEntity.ok(employeeServiceImpl.signIn(empEmailid, empPassword));
    }

    @GetMapping("/getalldata")
    public ResponseEntity<List<Employee>> getallData() {

        return ResponseEntity.ok(employeeServiceImpl.getAllData());
    }

    @GetMapping("/getdatabyid/{empId}")
    public ResponseEntity<Employee> getDataById(@PathVariable int empId) {

        return ResponseEntity.ok(employeeServiceImpl.getDataById(empId));
    }

    @GetMapping("/getdatabyname/{empName}")
    public ResponseEntity<List<Employee>> getDaataByName(@PathVariable String empName) {

        return ResponseEntity.ok(employeeServiceImpl.getDataByName(empName));
    }

    @GetMapping("/getdatabyemailid")
    public ResponseEntity<List<Employee>> getdatabyemailid(@PathVariable String empEmailId) {

        return ResponseEntity.ok(employeeServiceImpl.getDataByEmailId(empEmailId));
    }

    @GetMapping("/getdatabycontactnumber/{empContactNumber}")
    public ResponseEntity<List<Employee>> getdataByContactNumber(@PathVariable long empContactNumber) {

        return ResponseEntity.ok(employeeServiceImpl.getDataByContactNumber(empContactNumber));
    }


    @GetMapping("/getdatabydob/{empDOB}")
    public ResponseEntity<List<Employee>> getDataByDOB(@PathVariable String empDOB) {

        return ResponseEntity.ok(employeeServiceImpl.getDataByDOB(empDOB));
    }

    @GetMapping("/getdatabyusinganyinput/{input}")
    public ResponseEntity<List<Employee>> getDataByUsingAnyInput(@PathVariable String input) {

        return ResponseEntity.ok(employeeServiceImpl.getDataByUsingAnyInput(input));
    }

    @GetMapping("/sortbyid")
    public ResponseEntity<List<Employee>> sortById() {
        return ResponseEntity.ok(employeeServiceImpl.sortById());
    }

    @GetMapping("/sortbyname")
    public ResponseEntity<List<Employee>> sortByName() {
        return ResponseEntity.ok(employeeServiceImpl.sortByName());
    }

    @GetMapping("/sortbysalary")
    public ResponseEntity<List<Employee>> sortBysalary() {
        return ResponseEntity.ok(employeeServiceImpl.sortBySalary());
    }

    @GetMapping("/sortbydob")
    public ResponseEntity<List<Employee>> sortByDOB() {
        return ResponseEntity.ok(employeeServiceImpl.sortByDOB());
    }

    @GetMapping("/filterdatabysalary/{empSalary}")
    public ResponseEntity<List<Employee>> filterDataBySalary(@PathVariable double empSalary) {
        return ResponseEntity.ok(employeeServiceImpl.filterDataBySalary(empSalary));
    }

    @GetMapping("/checkloaneligibilty/{empId}")
    public ResponseEntity<String> checkLoanEligibilty(@PathVariable int empid) {
        String msg = "";
        if (employeeServiceImpl.checkLoanEligibilty(empid)) {
            msg = "Eligible For Loan";
        } else {
            msg = "Not Elgible For Loan";
        }
        return ResponseEntity.ok(msg);
    }

    @PutMapping("/updatedata/{empId}")
    public ResponseEntity<String> updateData(@PathVariable int empId, @RequestBody Employee employee) {

        Employee employee1 = employeeServiceImpl.getDataById(empId);

        if (employee1.getEmpId() == empId) {
            employeeServiceImpl.updateData(empId, employee);
        } else {
            throw new RecorNotFoundException("Employee Id Does Not Exist");
        }

        return ResponseEntity.ok("Data Updated Successfully");
    }

    @DeleteMapping("/deletedatabyid/{empId}")
    public ResponseEntity<String> deleteDataById(@PathVariable int empId) {
        employeeServiceImpl.deleteDataById(empId);
        return ResponseEntity.ok("Data Deleted Successfully");
    }

    @DeleteMapping("deletealldata")
    public ResponseEntity<String> deletealldata() {
        employeeServiceImpl.deleteAllData();
        return

                ResponseEntity.ok("All Data Deleted Successfully");
    }

}
