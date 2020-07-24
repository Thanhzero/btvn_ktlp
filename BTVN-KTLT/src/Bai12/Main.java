package Bai12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Teacher> teacherList = new ArrayList<>();
        List<Staff> staffList = new ArrayList<>();
        while (true){
            menu();
            switch (new Scanner(System.in).nextInt()){
                case 1 : printListTeacher(teacherList);break;
                case 2 : printListStaff(staffList);break;
                case 3 : return;
            }
        }
    }

    private static void printListStaff(List<Staff> staffList) {
        while (true){
            Staff staff = new Staff();
            staff.setInfo();
            staffList.add(staff);
            System.out.println("Bạn có muốn nhập tiếp không ? (yes/no)");
            if (new Scanner(System.in).nextLine().equalsIgnoreCase("No"))
                break;
        }
        System.out.println("\t\t\t DANH SÁCH GIÁO VIÊN");
        System.out.printf("| %20s | %20s | %10s | %20s | %20s |\n","Họ tên","Ngày tháng năm sinh","Giới tính","Công Việc","Phòng");
        for (int i = 0; i < staffList.size(); i++) {
            System.out.printf("| %20s | %20s | %10s | %20s | %20s |\n",staffList.get(i).getFullName(),staffList.get(i).getDateOfBirth(),staffList.get(i).getSex(),staffList.get(i).getWork(),staffList.get(i).getRoom());
        }
    }

    private static void printListTeacher(List<Teacher> teacherList) {
        while (true){
            Teacher teacher = new Teacher();
            teacher.setInfo();
            teacherList.add(teacher);
            System.out.println("Bạn có muốn nhập tiếp không ? (yes/no)");
            if (new Scanner(System.in).nextLine().equalsIgnoreCase("No"))
                break;
        }
        System.out.println("\t\t\t DANH SÁCH GIÁO VIÊN ");
        System.out.printf("| %20s | %20s | %10s | %20s |\n","Họ tên","Ngày tháng năm sinh","Giới tính","Chuyên ngành");
        for (int i = 0; i < teacherList.size(); i++) {
            System.out.printf("| %20s | %20s | %10s | %20s |\n",teacherList.get(i).getFullName(),teacherList.get(i).getDateOfBirth(),teacherList.get(i).getSex(),teacherList.get(i).getSpecialized());
        }
    }

    private static void menu() {
        System.out.println("1. Nhập và hiển thị danh sách giáo viên");
        System.out.println("2. Nhập và hiển thị danh sách nhân viên");
        System.out.println("3. Thoát");
        System.out.println("Mời bạn chọn");
    }
}
