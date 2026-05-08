package chapter4;

public class Product {
//    - Tạo class với yêu cầu ở trên, đặt tên là Product.java
//- khai báo các thuộc tính: name, price, tax
//- Tạo thêm 2 method cho class trên:
//            + nhapThongTin(): void (dùng để nhập thông tin object)
//+ xuatThongTin(): void (in ra thông tin object đã tạo)
//+ getTaxPrice(): double
//    số tiền thuế = price * tax
    private String name;
    private double price;
    private double tax;

    public Product() {

    }
    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Product nhapThongTin(String name, double price, double tax) {
        Product pr = new Product(name, price, tax);
        return pr;

    }
    public void xuatThongTin(Product pr) {
        System.out.println("name = " + pr.getName() + " price = " + pr.getPrice() + " tax" + pr.getTax());
    }
    public double getTaxPrice(double price, double tax) {
        return price * tax;
    }

    public static void main(String[] args) {
        System.out.println("Run PRoduct");
    }
    }
