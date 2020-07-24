package Bai12;

import java.util.Scanner;

public class Teacher  extends  People{
    private String specialized;

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    @Override
    public void setInfo() {
        super.setInfo();
        System.out.println("Chuyên ngành : ");
        this.setSpecialized(new Scanner(System.in).nextLine());
    }
}
