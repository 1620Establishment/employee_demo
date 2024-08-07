package com.example.employee_demo.Employee;

public class Employee implements Comparable<Employee> {

    private String name;

    private int age;

    private int exp;

    public Employee(String name, int age, int exp) {
        this.name = name;
        this.age = age;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public int compareTo(Employee emp) {
        return this.age - emp.age;
    }

    public String toString() {
        return this.name + " " + this.age + " " + this.exp;
    }
}
