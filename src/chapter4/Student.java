package chapter4;

public class Student {

    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  Student() {

    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
//    public String getName(){
//        return this.name;
//    }
//    public int getAge(){
//        return this.age;
//    }
//    public void learnJava(){
//        System.out.println("Learn Java with Youtube Hỏi Dân IT");
//    }
//    public void setName(String name1) {
//        this.name = name1;
//
//    }
}
