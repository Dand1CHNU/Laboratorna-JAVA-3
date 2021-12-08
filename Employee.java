package lab3;

import java.util.regex.*;

public class Employee implements Comparable<Employee> {


    private int id;
    private String Surname;
    private String Name;
    private String Lastname;
    private int age;
    private float salary;
    private int experience;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ",  Surname='" + Surname + '\'' +
                ",          Name='" + Name + '\'' +
                ",              Lastname='" + Lastname + '\'' +
                ",                   age=" + age +
                ",                       salary=" + salary +
                ",           experience=" + experience +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.getLastname().compareTo(o.getLastname());
    }
}
