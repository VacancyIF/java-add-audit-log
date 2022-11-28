package com.bytelegend.noencapsulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Utils {
    public static List<Person> filterPeopleWithSalaryMoreThan1(List<Person> people, int salary) {
        List<Person> list = new ArrayList<>();
        for (Person p : people) {
            Logger.logAccessToSalaryOfPerson(p.name)
            if (p.salary > salary) {
                list.add(p);
            }
        }
        return list;
    }

    public static List<Person> filterPeopleWithSalaryMoreThan2(List<Person> people, int salary) {
        List<Person> list = new ArrayList<>();
        for (Person p : people) {
            Logger.logAccessToSalaryOfPerson(p.name)
            if (p.salary > salary) {
                list.add(p);
            }
        }
        return list;
    }

    public static Map<String, Integer> getNameToSalaryMap1(List<Person> people) {
        Map<String, Integer> map = new HashMap<>();
        for (Person p : people) {
            Logger.logAccessToSalaryOfPerson(p.name)
            map.put(p.name, p.salary);
        }
        return map;
    }

    public static Map<String, Integer> getNameToSalaryMap2(List<Person> people) {
        Map<String, Integer> map = new HashMap<>();
        for (Person p : people) {
            Logger.logAccessToSalaryOfPerson(p.name)
            map.put(p.name, p.salary);
        }
        return map;
    }
}
