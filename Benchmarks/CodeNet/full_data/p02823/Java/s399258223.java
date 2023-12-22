import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        if ((a - b) % 2 == 0) {
            System.out.println(Math.abs(a - b) / 2);
        } else {
            System.out.println(Math.min(Math.max(a, b) - 1, n - Math.min(a, b)));
        }
    }
