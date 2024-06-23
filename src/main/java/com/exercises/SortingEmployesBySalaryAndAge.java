package com.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingEmployesBySalaryAndAge {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 30, 50000));
        employees.add(new Employee("Jane Smith", 25, 60000));
        employees.add(new Employee("Michael Johnson", 35, 55000));
        employees.add(new Employee("Emily Davis", 28, 58000));
        employees.add(new Employee("Chris Brown", 32, 52000));


        solution1(employees);
        solution2(employees);

    }

    private static void solution2(List<Employee> employees) {
        int n = employees.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (employees.get(j).getSalary() < employees.get(j + 1).getSalary()) {
                    Employee temp = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, temp);

                } else if (employees.get(j).getSalary() == employees.get(j + 1).getSalary()) {
                    if (employees.get(j).getAge() > employees.get(j + 1).getAge()) {
                        Employee temp = employees.get(j);
                        employees.set(j, employees.get(j + 1));
                        employees.set(j + 1, temp);
                    }
                }

            }
        }

        System.out.println("");
        System.out.println("Solution 2, using two fors");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    private static void solution1(List<Employee> employees) {
        System.out.println("Solution 1, using Collections Sort");
        Collections.sort(employees, Comparator.comparing(Employee::getSalary)
                .reversed()
                .thenComparing(Employee::getAge));

        //System.out.println("Employees sorted by salary (descending) and age (ascending):");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public static class Employee {
        private String name;
        private int age;
        private double salary;

        public Employee(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }
    }
}
