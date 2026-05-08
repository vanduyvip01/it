package lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu: ");
        int z = scanner.nextInt();
        int[] x = new int[z];
        System.out.println("nhap so phan tu: ");
        for ( int i = 0; i < z; i++) {
            x[i] = scanner.nextInt();
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < z; i++) {
            sum += x[i]; // tính tổng

            if (x[i] % 2 == 0) { // kiểm tra số chẵn
                count++;
            }
        }

        System.out.println("Tong cac phan tu la: " + sum);
        System.out.println("So luong so chan la: " + count);


        scanner.close();
    }
}
