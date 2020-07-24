package Bai12;

import java.util.Scanner;

public class People {
    private String fullName;
    private String dateOfBirth;
    private String sex;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setInfo(){
        System.out.println("Họ tên : ");
        this.setFullName(new Scanner(System.in).nextLine());
        System.out.println("Ngày tháng năm sinh : ");
        this.setDateOfBirth(new Scanner(System.in).nextLine());
        System.out.println("Giới tính : ");
        this.setSex(new Scanner(System.in).nextLine());
    }
}
