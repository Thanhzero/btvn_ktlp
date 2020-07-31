package Bai8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        do {
            menu();
            switch (new Scanner(System.in).nextInt()){
                case 1 : importList(studentList) ; break;
                case 2 : printList(studentList) ; break;
                case 3 : return;
                case 4 : findStudent(studentList) ; break;
                default:break;
            }
        }while (true);
    }

    private static void findStudent(List<Student> studentList) {
        System.out.println("Nhập sinh viên cần tìm ");
        String findName = new Scanner(System.in).nextLine();
        if (_findStudent(studentList,findName) >= 0){
            System.out.println("\t\t\tDANH SÁCH SINH VIÊN");
            System.out.printf("| %30s | %10s | %5s | %10s | \n","Ho tên","Lớp","Tuổi","Giới tính");
            studentList.get(_findStudent(studentList,findName)).printStudent();
        }
        else {
            System.out.println("Sinh viên không có trong danh sách");
        }

    }
    private static int _findStudent(List<Student> studentList, String findName){
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getFullName().equalsIgnoreCase(findName))
                return i;
        }
        return -1;
    }
    private static void printList(List<Student> studentList) {
        System.out.println("\t\t\tDANH SÁCH SINH VIÊN");
        System.out.printf("| %30s | %10s | %5s | %10s |\n","Ho tên","Lớp","Tuổi","Giới tính");
        for (Student student : studentList) {
            student.printStudent();
        }
    }

    private static void importList(List<Student> studentList) {
        do {
            studentList.add(new Student().createStudent());
            System.out.println("Bạn có muốn nhập tiếp ? (yes/no)");
            if (new Scanner(System.in).nextLine().equalsIgnoreCase("No"))
                return;
        }while (true);
    }

    private static void menu() {
        System.out.println("1. Nhập danh sách");
        System.out.println("2. Hiển thị danh sách");
        System.out.println("3. Thoát");
        System.out.println("4. Tìm kiếm theo tên");
        System.out.println("Mời bạn chọn");
    }
}
