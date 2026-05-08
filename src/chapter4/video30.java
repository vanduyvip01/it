package chapter4;

public class video30 {
    public static void main(String[] args) {
        Product test = new Product();
        Product pr1 = test.nhapThongTin(null, 200,0.2 );
        test.xuatThongTin(pr1);
        System.out.println(" tax = " + test.getTaxPrice(pr1.getPrice(), pr1.getTax()));
    }
}
