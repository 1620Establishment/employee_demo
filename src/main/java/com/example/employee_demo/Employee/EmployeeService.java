package com.example.employee_demo.Employee;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {

    public List<Employee> employeeList() {
        Employee employee1 = new Employee("Adithya", 24, 2);
        Employee employee2 = new Employee("Deepan", 22, 0);
        Employee employee3 = new Employee("Ruban", 26, 4);
        Employee employee4 = new Employee("Karthick", 23, 1);
        Employee employee5 = new Employee("Makesh", 28, 6);
        //Approach 1: For adding objects to the list
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        // Approach 2: For adding objects to the List
        List<Employee> empList = new ArrayList<>(Arrays.asList(employee1, employee2, employee3, employee4, employee5));

        //Approach 3: For adding objects to the List
        // this is an immutable list, ie no further operation can be done on the list.
        // If we try to modify this list, it will throw an "UnsupportedException"
        List<Employee> immutableList = List.of(employee1, employee2, employee3, employee4, employee5);

        //Approach 1: For using comparator functional interface as anonymous class.
        //For this approach we override the compareTo method of Employee class.
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.compareTo(o2);
            }
        });

        // Approach 2: For using comparator funtional interface as ananymous class
        // For this approach we don't need compareTo method in Employee class
        Collections.sort(empList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        });


        System.out.println(employees);
        System.out.println(empList);

        return employees;
    }
}
