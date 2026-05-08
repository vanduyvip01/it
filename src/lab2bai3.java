import java.util.Scanner;

public class lab2bai3 {
    public static void main(String[] args) {
//        Bài 3: Viết chương trình tính số tiền điện (in kết quả ra console)
//        Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
//        - Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
//                - Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500
//        Gợi ý:
//        - Nếu số điện <= 100 => số tiền = số điện x 1000
//                - Nếu số điện > 100
//                => số tiền = 100 * 1000 + (số điện - 100) * 1500
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
}
