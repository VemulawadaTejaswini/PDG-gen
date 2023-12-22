import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextLong();
        Arrays.sort(a);
 //       long[] b = new long[(n+1)/ 2], c = new long[n/2];
   //     for(int i = 0; i < b.length; i++) b[i] = a[n-1-i];
     //   for(int i = 0; i < c.length; i++) c[i] = a[i];
        long mid1 = a[n/2];
        long mid2 = a[(n+1) / 2];
        long ans1 = 0, ans2 = 0, ans3 = 0, ans4 = 0;
        for(int i = 0; i < n; i++){
            ans1 += Math.abs(a[i] - mid1) * 2;
            ans2 += Math.abs(a[n- i - 1] - mid1) * 2;
            ans3 += Math.abs(a[i] - mid2) * 2;
            ans4 += Math.abs(a[n- i - 1] - mid2) * 2;
        }
        ans1 -= a[0];
        ans3 -= a[0];
        ans2 -= a[n-2];
        ans4 -= a[n-2];
        System.out.println(Math.max(ans1, Math.max(ans3, Math.max(ans4,ans2))));
    }
}