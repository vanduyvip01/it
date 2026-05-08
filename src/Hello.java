import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("so a: " + Math.sqrt(64));
        int a = scanner.nextInt();
        System.out.println("so b: ");
        int b = scanner.nextInt();
        int c = Math.max(a,b);
        System.out.println("Max: " + c);
        scanner.close();
    }
}
