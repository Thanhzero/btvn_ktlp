package Bai12;

import java.util.Scanner;

public class Staff  extends People{
    private String work;
    private String room;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public void setInfo() {
        super.setInfo();
        System.out.println("Công việc : ");
        this.setWork(new Scanner(System.in).nextLine());
        System.out.println("Phòng : ");
        this.setRoom(new Scanner(System.in).nextLine());
    }
}
