package com.jsp.dao;

import com.jsp.dto.Employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDao {
    @Autowired
    EntityManager manager;
    @Autowired
    EntityTransaction transaction;

    // to insert employee object into db
    public void savedEmployee(Employees emp){
        transaction.begin();;
        manager.persist(emp);
        transaction.commit();
    }
    //to search for an employee based on id
    public Employees getEmployeeById(int id){
        Employees emp = manager.find(Employees.class,id);
        return emp;
    }
    //to update employee object
    public void updateEmployee(Employees newEmp){
        transaction.begin();
        manager.merge(newEmp);
        transaction.commit();
    }
    //to delete employee object
    public void deleteEmployee(int id){
        Employees emp =manager.find(Employees.class,id);
        transaction.begin();
        manager.remove(emp);
        transaction.commit();
    }
    //to view all employee details
    public List<Employees> getEmployee(){
        Query q = manager.createQuery("select e from e");
        List<Employees> employeeList = q.getResultList();
        return employeeList;
    }
}
