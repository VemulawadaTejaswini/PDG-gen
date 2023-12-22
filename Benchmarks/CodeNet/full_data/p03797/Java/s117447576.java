import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        long ans = 0;

        if (n >= m / 2) {
            ans = n;
        } else {
            ans += n;
            m -= n * 2;
            ans += m / 4;
        }

        System.out.println(ans);
    }
}