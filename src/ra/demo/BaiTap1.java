package ra.demo;

public class BaiTap1 {
    public static void main(String[] args) {
        // kiểm tra từ 1-100
        for (int i = 2; i < 100; i++) {

            // code kiểm tra số nguyên tố
            // kiểm tra i có phải số nguyên tố không
            boolean flag = true ;// giả sử i là số nguyên tô
            for (int j = 2; j <=Math.sqrt(i) ; j++) {
                if (i%j==0){
                    // không là số nguyen tố
                   flag =false;
                    break;
                }
            }
            if (flag){
                // đây là số nguyên tố
                System.out.println("Số nguyên tố "+i);
            }
        }
    }
}
