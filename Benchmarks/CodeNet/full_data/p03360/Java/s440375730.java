import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int max = a;
        int maxi = 1;
        if (max < b) {
            max = b;
            maxi = 2;
        }
        if (max < c) {
            max = c;
            maxi = 3;
        }
        if (maxi == 1) {
            System.out.println((int)(a * Math.pow(2, k) + b + c));
        } else if (maxi == 2) {
            System.out.println((int)(b * Math.pow(2, k) + a + c));
        } else {
            System.out.println((int)(c * Math.pow(2, k) + b + a));
        }
    }
}