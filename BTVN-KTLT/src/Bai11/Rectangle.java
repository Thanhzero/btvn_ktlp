package Bai11;

import java.util.Scanner;

public class Rectangle {
    private double width;
    private double lenght;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public void setSize(){
        System.out.println("Chiều dài : ");
        this.setLenght(new Scanner(System.in).nextDouble());
        System.out.println("Chiều rộng : ");
        this.setWidth(new Scanner(System.in).nextDouble());
    }
    public void acreage(){
        System.out.println("Diện tích HCN có chiều dài : " + this.getLenght()  + " và chiều rộng : "+this.getWidth()+ " là : " + this.getLenght() * this.getWidth());
    }
    public void perimeter(){
        System.out.println("Chu vi HCN có chiều dài : " + this.getLenght() + " và chiều rộng : " + this.getWidth() + " là : " + (this.getLenght() + this.getWidth()) * 2);
    }
    public void pain(){
        int lenght = (int)Math.round(this.getLenght());
        int width = (int)Math.round(this.getWidth());
        for (int i = 0; i <width ; i++) {
            for (int j = 0; j < lenght; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
