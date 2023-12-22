import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long c = sc.nextLong();
        long[] x = new long[n+1];
        long[] v = new long[n+1];
        x[0] = 0; v[0] = 0;
        for(int i = 1; i < n+1; i++){
            x[i] = sc.nextLong();
            v[i] = sc.nextLong();
        }
        long[] f = new long[n+1];
        f[0] = 0;
        for(int i = 1;  i < n+1; i++){
            f[i] = f[i-1] + v[i] - x[i] + x[i-1];
        }
        long[] g = new long[n+1];
        long[] cg = new long[n+1];
        g[0] = f[0]; cg[0] = 0;
        for(int i = 1; i < n+1; i++){
            if(g[i-1] > f[i]){
                g[i] = g[i-1];
                cg[i] = cg[i-1];
            }
            else{
                g[i] = f[i];
                cg[i] = x[i];
            }
        }

        long[] b = new long[n+1];
        b[0] = 0;
        b[n] = v[n] + x[n] - c;
        for(int i = n-1; i > 0; i--){
            b[i] = b[i+1] + v[i] + x[i] - x[i+1];
        }
        long[] aa = new long[n+1];
        long ans = 0;
        for(int bx = n; bx >= 0; bx--){
            if(bx > 0){
                aa[bx] = b[bx] + g[bx-1];
                ans = Math.max(ans, Math.max(aa[bx] - c + x[bx], aa[bx] - cg[bx-1]));
            }
            else{
                aa[0] = g[n];
                ans = Math.max(ans, aa[0]);
            }                  
        }
        System.out.println(ans);
    }
}