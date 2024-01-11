package ra.demo;

import java.util.Scanner;

public class Shape {

    public static void main(String[] args) {
        // vẽ hình chữ nhật
//        int a =10;
//        int b = 5;
//        for (int i =0;i<5;i++){
//            for (int j = 0; j < 10; j++) {
//                if(i==4||i==0||j==0||j==9) {
//                    System.out.print(" * ");
//                }else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }
        System.out.println("Nhập chiều cao tam giac");
        int h = new Scanner(System.in).nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                if (i+j>=h-1 && i>=j)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
