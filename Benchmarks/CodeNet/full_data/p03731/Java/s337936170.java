import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long T = sc.nextLong();
        long start = 0;
        long end = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long t = sc.nextLong();
            if(t <= end) end = t + T;
            else{
                ans += end - start;
                start = t;
                end = t + T;
            }
            if(i == n - 1) ans += end - start;
        }

        System.out.println(ans);
        sc.close();
    }

}
