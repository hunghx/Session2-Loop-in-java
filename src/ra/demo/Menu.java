package ra.demo;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // hiên thị menu và điều hướng theo chức năng
        while (true) {
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số.\n" +
                    "2. kiểm tra số nguyên tố.\n" +
                    "3. Kiểm tra một số có chia hết cho 3 không.\n" +
                    "4. Thoát\n");
            System.out.println("Hãy nhập lựa chọn");
            byte choice = new Scanner(System.in).nextByte();
            switch (choice) {
                case 1:
                    // kiểm tra chẵn lẻ
                    System.out.println("Kiểm tra chẵn lẻ");
                    break;
                case 2:
                    // kiểm tra số nguyên tố
                    System.out.println("Kiểm tra số nguyên tố");
                    break;
                case 3:
                    // kiểm tra chia cho 3
                    System.out.println("Kiểm tra chia hết");
                    break;
                case 4:
//                    System.exit(0); // dưng chương trinh
                    break;
                default:
                    System.err.println("Lưa chọn không hợp lệ");
            }
            if (choice==4){
                break;
            }
        }
    }
}
