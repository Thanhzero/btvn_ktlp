import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        System.out.println("Nhập số phần tử của dãy : ");
        int size = new Scanner(System.in).nextInt();
        int[] listNumber = new int[size];
        while (true) {
            menu();
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    scanList(listNumber);
                    break;
                case 2: {
                    System.out.println("Giá trị lớn nhất là : " + listNumber[findMax(listNumber,size, 0, 0)]);
                    break;
                }
                case 4: {
                    System.out.println("Tổng các phần tử trong dãy là : " + sum(listNumber, 0, 0));
                    break;
                }
                case 3:
                    return;
                default:
                    break;
            }
        }
    }

    private static int sum(int[] listNumber, int index, int sum) {
        if (index >= listNumber.length)
            return sum;
        return sum(listNumber, index + 1, sum + listNumber[index]);
    }

    private static int findMax(int[] listNumber, int size, int maxIndex, int currentIndex) {
        if (currentIndex > size)
            return maxIndex;
        return findMax(listNumber, size, listNumber[maxIndex] > listNumber[currentIndex] ? maxIndex : currentIndex, currentIndex + 1);
    }

    private static void scanList(int[] listNumber) {
        System.out.println(" Nhập các phần tử của dãy : ");
        for (int i = 0; i < listNumber.length; i++) {
            System.out.print("list[" + i + "] : ");
            listNumber[i] = new Scanner(System.in).nextInt();
        }
    }

    private static void menu() {
        System.out.println("1. Nhập dãy số");
        System.out.println("2. Tìm phần tử lớn nhất");
        System.out.println("3. Thoát");
        System.out.println("4. Tính tổng các phần tử");
        System.out.println("Mời bạn chọn");
    }
}
