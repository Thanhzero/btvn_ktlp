import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        int  number = 0;
        do {
            menu(number);
            switch (new Scanner(System.in).nextInt()){
                case 1 : {
                    System.out.println("Nhập số nguyên dương n : ");
                    number = new Scanner(System.in).nextInt();break;
                }
                case 2 : printPrimeLoop(number);break;
                case 4 : {
                    System.out.println("Các số nguyên tố nhỏ hơn " + number + " là :");
                    prinPrimeRecursive(number,0);
                    System.out.println();break;
                }
                case 3 : return;
                default:break;
            }
        }while (true);
    }
    private static  boolean _isPrimeRecursive(int number, int i){
        if (i > Math.sqrt(number))
            return true;
        if (number % i == 0)
            return false;
        return _isPrimeRecursive(number,i+1);
    }
    private static boolean isPrimeRecursive(int number){
        if (number < 2)
            return false;
        return _isPrimeRecursive(number,2);
    }
    private static void prinPrimeRecursive(int number,int  i) {
        if (i > number)
            return;
        if (isPrimeRecursive(i))
            System.out.print(i + " ");
        prinPrimeRecursive(number,i+1);
    }


    private static boolean isPrimeLoop(int number){
        if (number < 2)
            return false;
        else {
            for (int i = 2; i < number-1; i++) {
                if (number % i ==0)
                    return false;
            }
            return true;
        }
    }

    private static void printPrimeLoop(int number) {
        System.out.println("Các số nguyên tố nhỏ hơn " + number + " là : ");
        for (int i = 0; i < number; i++) {
            if (isPrimeLoop(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void menu(int number) {
        System.out.println("1. Nhập số nguyên dương");
        System.out.println("2. Hiển thị số nguyên tố nhỏ hơn " + number + " Sử dung vòng lặp");
        System.out.println("3. Thoát");
        System.out.println("4. Hiển thị số nguyên tố nhỏ hơn " + number + " Sử dụng đệ quy");
        System.out.println("Mời bạn chọn");
    }
}
