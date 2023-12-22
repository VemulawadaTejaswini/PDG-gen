import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int odd = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() % 2 == 1) {
                odd++;
            }
        }
        if (odd < 1) {
            System.out.println(p == 0 ? (long) Math.pow(2, n) : 0);
        } else {
            System.out.println((long) Math.pow(2, n - 1));
        }
    