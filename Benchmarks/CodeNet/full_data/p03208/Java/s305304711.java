import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
        }
        Arrays.sort(p);
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i <= n - k; i++){
            ans = Math.min(p[i + k - 1] - p[i], ans);
        }
        System.out.println(ans);
    }
}