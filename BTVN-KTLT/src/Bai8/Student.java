package Bai8;

import java.util.Scanner;

public class Student {
    private String fullName;
    private String className;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Student createStudent(){
        Student student = new Student();
        System.out.println("Họ tên : ");
        student.setFullName(new Scanner(System.in).nextLine());
        System.out.println("Lớp : ");
        student.setClassName(new Scanner(System.in).nextLine());
        System.out.println("Tuổi : ");
        student.setAge(new Scanner(System.in).nextInt());
        return student;
    }
    public void printStudent(){
        System.out.printf("| %30s | %10s | %5d |\n",this.getFullName(),this.getClassName(),this.getAge());
    }
}
