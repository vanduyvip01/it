import java.util.Scanner;

public class lab2bai4 {
    public static void lab2bai1() {
        System.out.println("LỰA CHỌN TÍNH NĂNG 1 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap b: ");
        int b = scanner.nextInt();

        System.out.printf("Giai phuong trinh bac nhat %dx + %d = 0 \n", a,b);
        if (a == 0 && b == 0 ) {
            System.out.println("Phuong trinh vo so nghiem");

        } else if( a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");

        } else {
            float x = (float) -b/a;
            System.out.printf("Phuong trinh co nghiem = %.3f  ", x);

        }
        scanner.close();
    }
    public static void lab2bai2() {
        System.out.println("LỰA CHỌN TÍNH NĂNG 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap b: ");
        int b = scanner.nextInt();
        System.out.println("Nhap c: ");
        int c = scanner.nextInt();
        System.out.printf("Giai phuong trinh bac nhat %dx^2 + %dx + %d = 0 \n", a,b,c);

        if (a == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else {
            int delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                float x = (float) -b / (2 * a);
                System.out.printf("Phuong trinh co nghiem kep = %.3f", x);
            } else {
                System.out.println("Co 2 nghiem rieng biet: ");
                float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
                float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("x1 = %.3f  ", x1);
                System.out.printf("x2 = %.3f  ", x2);

                scanner.close();
            }
        }
    }
    public static void lab2bai3() {
        System.out.println("LỰA CHỌN TÍNH NĂNG 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dien: ");
        int soDien = scanner.nextInt();
        if (soDien < 100) {
            int soTienDien = soDien * 1000;
            System.out.println("So tien dien cua ban la: " + soTienDien);
        } else {
            int soTienDien = 100 * 1000 + (soDien - 100) * 1500;
            System.out.println("So tien dien cua ban la: " + soTienDien);
            scanner.close();
        }
    }

        public static void main(String[] args) {

        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai |");
        System.out.println("| 3. Tính số tiền điện |");
        System.out.println("| 4. Kết thúc |");
        System.out.println("++ ------------------ ++");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay lua chon tinh nang: ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                lab2bai1();
                break;
            case 2:
                lab2bai2();
            case 3:
                lab2bai3();
            default:
                System.out.println("Ban da thoat chuong trinh");
                System.exit(0);
                    }
                }



    }

