Loading subst-jis...done
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a >= b && a >= c) {
            sum = b + c;
        } else if (b >= a && b >= c) {
            sum = a + c;
        } else {
            sum = a + b;
        }
        System.out.println(sum);
    }
}