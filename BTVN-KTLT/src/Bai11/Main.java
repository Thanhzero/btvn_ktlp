package Bai11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            menu();
            switch (new Scanner(System.in).nextInt()){
                case 1 : squareWork();break;
                case 2 : rectangleWork();break;
                case 3 : return;
                default:break;
            }
        }
    }

    private static void rectangleWork() {
        Rectangle rectangle = new Rectangle();
        System.out.println("Nhập kích thước hình : ");
        rectangle.setSize();
        rectangle.acreage();
        rectangle.perimeter();
        System.out.println("Vẽ hình : ");
        rectangle.pain();
    }

    private static void squareWork() {
        Square square = new Square();
        System.out.println("Nhập cạnh của hình tròn : ");
        square.setEdge(new Scanner(System.in).nextDouble());
        square.acreage();
        square.perimeter();
        System.out.println("Vẽ hình : ");
        square.pain();
    }

    private static void menu() {
        System.out.println("1. Làm việc với hình vuông");
        System.out.println("2. Làm việc với HCN");
        System.out.println("3. Thoát");
        System.out.println("Mời bạn chọn");
    }
}
