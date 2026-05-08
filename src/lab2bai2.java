import java.util.Scanner;

public class lab2bai2 {
    public static void main(String[] args) {
//        Bài 2: Cho phương trình: ax^2 + bx + c = 0
//        Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương trình
//                trên
//        Gợi ý:
//        - Nếu a = 0 => làm tương tự ví dụ bài 1
//                - Nếu a # 0:
//        - Tính delta = b^2 - 4ac.
//                - Nếu delta < 0 => thông báo "phương trình vô nghiệm"
//                - Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
//                - Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
//                x1 = (-b + căn(delta))/(2*a)
//        x2 = (-b - căn(delta))/(2*a)
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
            if (delta < 0 ) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                float x = (float) -b / ( 2* a);
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
}
