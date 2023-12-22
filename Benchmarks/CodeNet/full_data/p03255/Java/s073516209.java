import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        long ans = 0;

        ans += a[n-1];
        for(int i = n-1; i > 0; i--){
            ans += x;
            ans += (a[i] - a[i-1]) * (n - i + 1) * (n - i + 1);
        }
        ans += a[0] * (n + 1) * (n + 1);

        ans += x * 2;

        System.out.println(ans);
    }
}