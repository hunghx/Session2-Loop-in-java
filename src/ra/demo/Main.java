package ra.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Vòng lặp for
        // thường dùng khi biết trước số lần lặp

        for(int i = 1; i<=10 ;i++){
            System.out.println("Giá trị hiện tại của i = "+i);
        }

        // while/ do while
        int count = 0; // số lượng số chia hết cho 3
        int number = 1; // giá trị cần kiểm tra


//        while(count<5){ // điều kiện để tiếp tục tìm kiếm
//           if (number%3==0){
//               System.out.println("Số "+number);
//               count++; // tăng giá trị biến đếm nếu tìm được
//           }
//            number++; // tăng giá trị cần kiểm tra lên
//        }

        do{
            if (number%3==0){
                System.out.println("Số "+number);
                count++;
            }
            number++;
        }while (count<5);


        // break : dừng và thoát khỏi vòng lặp hiện tại
        // continue : dừng và nhảy qua vòng lặp kế tiếp
        // Bài toán : Nhập kí tu từ bàn phím v hiển th các kí tự vừa nhập, nếu nhập 0 thì dừng vòng lặp

        while (true){
            System.out.println("Hãy nhập 1 kí tu");
            char kiTu = new Scanner(System.in).nextLine().charAt(0);
            if (kiTu == '0'){
                System.err.println("thoát vòng lặp");
                break; //dung và thoát khoi vòng lặp
            }
            System.out.println("kí tự bạn vừa nhập là : "+kiTu);
        }

        // hiển thị các số chẵn có 2 chữ số
        for (int i = 10; i <100 ; i++) {
            if (i%2!=0) continue; // nếu là số lẻ thì bỏ qua vòng lặp hiện tại
            System.out.println("I = "+i);
        }
    }
}
