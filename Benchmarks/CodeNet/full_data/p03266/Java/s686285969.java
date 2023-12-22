import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t = n / k;
        int ans = t * t * t;
        if (k % 2 == 0) {
            t = ((n*2) / k +1)/2;
            ans += (t * t * t);
        }

        System.out.println(ans);

    }
}