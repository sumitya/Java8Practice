package com.example.anonym_func.realexamples.sort;

import com.example.anonym_func.realexamples.employee.Employee;
import com.example.anonym_func.realexamples.employee.EmployeeDAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);

        List<Employee> employees = EmployeeDAO.getEmployees();

        // Traditional way to sort Employee Collection based on salary
        /*Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());// ascending
			}
		});*/

        // Lambda way to sort Employee collection based on salary.
        Collections.sort(employees, (o1, o2) ->(int) (o1.getSalary() - o2.getSalary()));

        employees
        .stream()
        .sorted((o1, o2) ->(int) (o1.getSalary() - o2.getSalary()))
        .forEach(System.out::println);

        employees
        .stream()
        .sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);

        // System.out::println is same as x -> System.out.println(x)

    }

}
