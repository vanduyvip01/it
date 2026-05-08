package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class video36 {
    public static void main(String[] args) {
        System.out.print("Nhap vao 1 so thuc bat ky: ");
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> arrNumber = new ArrayList<>();
        while (true) {
            System.out.print("Nhap vao 1 so thuc bat ky: ");
            double input = scanner.nextDouble();
            arrNumber.add(input);
            scanner.nextLine();
            System.out.print("continue : Y or N ??");
            String option = scanner.nextLine();
            if(option.equals("N")|| option.equals("n")){
                break;
            }
        }
        System.out.println("check array" + arrNumber);
        double sum =0;
        for(int i = 0; i < arrNumber.size(); i++){
            sum+= arrNumber.get(i);
        }
        System.out.println("sum array = " + sum);
    }
}
