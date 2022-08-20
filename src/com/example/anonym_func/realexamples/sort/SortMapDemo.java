package com.example.anonym_func.realexamples.sort;

import com.example.anonym_func.realexamples.employee.Employee;

import java.util.*;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
        employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
        employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
        employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
        employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
        employeeMap.put(new Employee(284, "Prakash", "SOCIAL", 1200000), 120);

        employeeMap
        .entrySet()
        .stream()
        .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept).reversed()))
        .forEach(System.out::println);

    }

}
