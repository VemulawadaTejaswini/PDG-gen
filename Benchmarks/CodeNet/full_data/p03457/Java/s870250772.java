import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n+1], x = new int[n+1], y = new int[n+1];
        boolean flag = true;
        t[0] = 0;
        x[0] = 0;
        y[0] = 0;
        for(int i = 1; i < n+1; i++){
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for(int i = 1; i < n+1; i++){
            if(t[i] - t[i-1] < Math.abs(x[i] - x[i-1]) + Math.abs(y[i] - y[i-1])
               || (t[i] - t[i-1])% 2 != Math.abs(x[i] + y[i] - x[i-1] - y[i-1]) % 2) flag = false;
        }
        String ans = flag ? "Yes" : "No";
        System.out.println(ans);
    }
}