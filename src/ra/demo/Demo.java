package ra.demo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước trái tim: ");
        int size = scanner.nextInt();

        drawHeart(size);
    }

    public static void drawHeart(int size) {
        int totalRows = size * 2 + 1;
        int halfSize = size / 2;

        for (int row = 0; row < totalRows; row++) {
            for (int col = 0; col <= size; col++) {
                if (row < size) {
                    if ((col == 0 || col == size) && row % 2 == 0) {
                        System.out.print("*");
                    } else if (col > 0 && col < size && row % 2 != 0) {
                        if (col <= row || col >= size - row) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (row == size) {
                        if (col == 0 || col == size) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        if (col >= row - size + 1 && col <= size - (row - size) - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println();
        }

    }
}
