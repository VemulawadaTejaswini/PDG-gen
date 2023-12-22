import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] ans = new int[n];

        int sum = 0;
        int point = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += Math.abs(point - a[i]);
            point = a[i];
        }
        sum += Math.abs(a[n-1] - 0);

        for (int i = 0; i < n; i++) {
            int tmp = sum;
            int l = 0;
            int r = 0;
            if (i >= 1)    l = a[i-1];
            if (i < n-1)   r = a[i+1];

            tmp -= Math.abs(l - a[i]);
            tmp -= Math.abs(r - a[i]);
            tmp += Math.abs(l - r);
            ans[i] = tmp;
        }
        
        for (int i : ans)
            System.out.println(i);
    }
}
