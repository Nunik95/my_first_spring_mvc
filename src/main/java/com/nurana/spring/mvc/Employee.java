/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nurana.spring.mvc;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author user
 */
public class Employee {
    @Size(min=2, message="name must be min 2 symbols")
    private String name;
     @NotBlank(message="surname is required field")
    private String surname;
     @Min(value=500, message="must be greater than 499")
     @Max(value=5500, message="must be less than 5501")
    private int salary;
    private String department;
    private Map <String, String> departments;
    private String carBrand;
    private Map <String, String> cars;
    private String[] languages;
    @Pattern(regexp="\\d{3}-\\d{2}-\\d{2}", message="please, use pattern: XXX-XX-XX")
    
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
private Map <String, String> languageList;
    
    public Map<String, String> getCars() {
        return cars;
    }

   

    

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public void setCars(Map<String, String> cars) {
        this.cars = cars;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Employee() {
        departments=new HashMap<>();
        departments.put("Information Technologies", "IT");
        departments.put("Human Resourses", "HR");
        departments.put("Sales", "Sales");
        cars=new HashMap<>();
        cars.put("BMW", "BMW");
        cars.put("Volvo", "Volvo");
        cars.put("KIA", "KIA");
        languageList=new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("Russian", "RUS");
        languageList.put("Turkish", "TR");
   
           
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
   
}
