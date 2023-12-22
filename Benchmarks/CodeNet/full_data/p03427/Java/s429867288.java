import java.util.Scanner;

public class Main {
    public Main () {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int a;
        int ans;
        String s = String.valueOf(n);

        a = s.charAt(0) - '0';

        ans = a - 1 + (s.length() - 1) * 9;

        System.out.println(ans);
    }


    public static void main (String[] args) {
        new Main();
    }

}
