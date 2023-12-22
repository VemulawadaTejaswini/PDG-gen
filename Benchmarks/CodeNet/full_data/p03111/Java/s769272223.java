import java.util.*;
class Main
{
    public  static int N, a, b, c;
    public static int[] l;
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        l = new int[N];
        for(int i = 0; i < N; i++){
            l[i] = sc.nextInt();
        }
        System.out.println(solve(0, 0, 0, 0));
    }
    static int solve(int n, int x, int y, int z){
        if(n == N){
            if(Math.min(x, Math.min(y, z)) > 0) return Math.abs(a - x) + Math.abs(b - y) + Math.abs(c - z) - 30;
            else return 10000000;
        }
        int res0,res1, res2, res3;
        res0 = solve(n + 1, x, y, z);
        res1 = solve(n + 1, x + l[n], y, z) + 10;
        res2 = solve(n + 1, x, y + l[n], z) + 10;
        res3 = solve(n + 1, x, y, z + l[n]) + 10;
        return Math.min(res0, Math.min(res1, Math.min(res2, res3)));
    }
}