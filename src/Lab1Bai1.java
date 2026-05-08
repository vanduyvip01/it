import java.util.Arrays;
import java.util.Scanner;

public class Lab1Bai1 {
    public static void main(String[] args) {

        int[] clubs = {1,5,51,43,22};
        for(int i = 0; i < clubs.length - 1; i++) {
            for(int j = i + 1; j < clubs.length; j++) {
                if(clubs[i] > clubs[j]) {
                    int temp = clubs[i];
                    clubs[i] = clubs[j];
                    clubs[j] = temp;
                }
            }
        }

    }
}
