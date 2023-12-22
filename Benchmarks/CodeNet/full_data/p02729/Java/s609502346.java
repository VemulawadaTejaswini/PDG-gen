import java.math.*;
import java.util.*;

public class Main {
    static int sol(int n) {
        if (n == 1) {
            return 0;
        }
        else {
            int tmp = n * (n - 1);
            return tmp / 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        ans = sol(n) + sol(m);
        System.out.println(ans);
        }
    }