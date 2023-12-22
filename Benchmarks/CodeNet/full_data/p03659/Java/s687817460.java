import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), ans = Integer.MAX_VALUE, sum = 0;
        int a[] = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = scan.nextInt();
            sum += a[i];
        }

        int sum2 = 0;
        for(int i = 0;i < n-1;i++){
            sum2 += a[i];
            ans = Math.min(ans, Math.abs(sum2-(sum-sum2)));
        }

        System.out.println(ans);
    }
}
