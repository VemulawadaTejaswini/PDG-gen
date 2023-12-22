import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int k = sc.nextInt();

        long ans = 0;
        long a = 1;

        while (true) {
            a *= k;
            ans++;
            if (n < a) {
                break;
            }
        }

        System.out.println(ans);
    }
}