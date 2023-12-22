import java.util.Scanner;

public class Main {
    public Main () {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int ans;
        int sum = 0;

        String s = String.valueOf(n);

        int a = s.charAt(0) - '0';

        ans = a - 1 + (s.length() - 1) * 9;

        for(int i = 0; i< s.length(); i++)
            sum += s.charAt(i) - '0';

        if (ans < sum)
            ans = sum;

        System.out.println(ans);
    }


    public static void main (String[] args) {
        new Main();
    }

}
