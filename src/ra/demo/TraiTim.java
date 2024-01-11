package ra.demo;

import java.util.Scanner;

public class TraiTim {
    public static void main(String[] args) {
        System.out.println("        **************               **************         ".length());
        // 16 hàng -  60 cột

        System.out.println("        ***********               ***********         ");
        System.out.println("     *               *         *               *      ");
        System.out.println("   *                   *     *                    *   ");
        System.out.println(" *                       * *                        * ");
        System.out.println("*                                                    *");
        System.out.println("*                                                    *");
        System.out.println("  *                                               *   ");
        System.out.println("     *                                         *      ");
        System.out.println("        *                                   *         ");
        System.out.println("           *                             *            ");
        System.out.println("              *                       *               ");
        System.out.println("                 *                 *                  ");
        System.out.println("                    *           *                     ");
        System.out.println("                       *     *                        ");
        System.out.println("                          *                           ");


        /*
           * * * * * * * * * * * * *
         * * * * * *       * * * * * *          1 - 2-3
       * * * * * * * *   * * * * * * * *        2 - 4-9   3 - 7-
     * * * * * * * * * * * * * * * * * * *   0-  w-1  17 12 -0 111
       * * * * * * * * * * * * * * *       1 - w-2   y-3 = x-6 y = 12- x
       *
         * * * * * * * * * * * * *
           * * * * * * * * * * *
             * * * * * * * * *
               * * * * * * *
                 *       *
                   *   *
                     *
                     * index = h-1
                     * y  = 3 -x  y= x-6 y-3 = 12-x
                     *
                     *
                     * y-9 = -(x+6)
                     * y-9 = |x+6|
                     * y = x+14

* h-1
                     2-3
                     3-5 => j = 2i-1
                     4-7
         */
//        Nhập vào chiều cao

        System.out.println("Nhập h");
        int h = new Scanner(System.in).nextInt();
        int w  = 2*h -1;
        int day = (w-3)/2;
        int row= 0;
        while (day-2>4){
            row++;
            day-=2;
        }
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 19 ; j++) {
//                if((j<=i+6 && i>= 3-j)&&(i+15>=j||i+j<=12)){
//                      System.out.print(" * ");
//                }else System.out.print("   ");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w ; j++) {
                if (i-j==0||i+j==w-1){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }


    }
}
