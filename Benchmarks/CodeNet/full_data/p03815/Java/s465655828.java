import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long ans = (long) Math.ceil((double) x / 11);
        long part = x % 11;
        ans *= 2;
        if (part <= 6) {
            ans--;
        }
        System.out.println(ans);
    }
}