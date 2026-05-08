package lab03;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So phan tu la: ");
        int x = scanner.nextInt();
        int[] z = new int[x];
        System.out.println("Nhap cac day so: ");
        for (int i = 0; i < x; i++) {
            z[i] = scanner.nextInt();
        }
        int max = z[0];
        for (int i = 0; i < z.length - 1; i++) {
            max = Math.max(max, z[i]);
        }
        System.out.println("So lon nhat thu 2 la: = " + max);

    }
}
