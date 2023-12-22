import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long k = l / 11;
        if(l - k * 11 <= 5){
            System.out.println(k * 2 + 1);
        }
        else System.out.println(k * 2 + 2);

    }

}