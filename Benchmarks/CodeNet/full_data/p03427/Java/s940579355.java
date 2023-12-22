import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int l = String.valueOf(n).length();
        if (l == 1) {
            System.out.println(n);
        } else {
            System.out.println(9 * (l - 1) + n / (long)(Math.pow(10, l - 1)) - 1);
        }
    }
}
