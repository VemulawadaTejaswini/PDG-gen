import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int b = 1;
        for (int i = 0; i < n; i++) {
            b = Math.min(b + k, 2 * b);
        }
        System.out.println(b);
    }
}
