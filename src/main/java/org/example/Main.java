package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ComputerScienceStudent nerdy = new ComputerScienceStudent("123", "home sweet home", 8);
        System.out.println(nerdy);
        ComputerScienceStudent semiNerdy = new ComputerScienceStudent("456", "home sweet home", 4);
        System.out.println(semiNerdy);
        System.out.println(semiNerdy.wearsGlasses(true));
        Student student = new BiologyStudent();
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        student.tellMeAboutYourSubject();
        BiologyStudent bio = new BiologyStudent();
        bio.tellMeAboutYourSubject();
        Student studentOnly = new Student();
        studentOnly.tellMeAboutYourSubject();
    }
}