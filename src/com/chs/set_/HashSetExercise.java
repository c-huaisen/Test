package com.chs.set_;

import java.util.HashSet;

@SuppressWarnings({"all"})
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("tom", 18));
        hashSet.add(new Employee("hans", 20));
        hashSet.add(new Employee("tom", 18));
        hashSet.add(new Employee("tom", 25));
        System.out.println(hashSet);

        String s = new String();

    }
}

class Employee {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //如果name和age的值相同，在使用equals时，返回true
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getName() != null ? !getName().equals(employee.getName()) : employee.getName() != null) return false;
        return getAge() != null ? getAge().equals(employee.getAge()) : employee.getAge() == null;
    }

    //如果name和age值相同，在计算hashCode()时，返回相同的结果
    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getAge() != null ? getAge().hashCode() : 0);
        return result;
    }
}



