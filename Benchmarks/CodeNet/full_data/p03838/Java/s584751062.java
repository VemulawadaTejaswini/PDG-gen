import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // AGC 008 Simple Calculator
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        long y = sc.nextInt();
        long ans = Math.abs(Math.abs(x) - Math.abs(y));
        if (x * y < 0) {
            ans++;
        } else if (x > y) {
            ans += 2;
        }
        System.out.println(ans);
    }
}