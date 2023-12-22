import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n], c = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0; i < n; i++) b[i] = sc.nextInt();
        for(int i = 0; i < n; i++) c[i] = sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(c);
        long ans = 0;
        for(int i = 0; i < n; i++){
            int X = Arrays.binarySearch(a, b[i]);
            if(X < 0)       X = -(X + 1);
            int Y = Arrays.binarySearch(c, b[i]);
            if(Y >= 0) Y = n - Y - 1;
            else       Y = n + Y + 1;
            ans += X * Y;
        }
        System.out.println(ans);
    }
}