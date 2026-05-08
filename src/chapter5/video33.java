package chapter5;

import chapter4.Student;

import java.util.ArrayList;

public class video33 {
    public static void main(String[] args) {
        int a = 10;
        ArrayList a2 = new ArrayList();
        ArrayList<String> a1 = new ArrayList<String>();
        ArrayList<Student> a3 = new ArrayList<Student>();

        a1.add("Hoi tao ne1");
        a1.add("Hoi tao ne2");

        a1.add("Hoi tao ne");
        a1.remove(1);
        System.out.println(a1.toString() + " " + a1.get(1));
    }
}
