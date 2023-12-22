import java.util.Scanner;

public class Main {

    static int L;
    static int N;
    static int[] X;
    static int h;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        L = sc.nextInt();
        N = sc.nextInt();
        X = new int[N];
        h = (L+1)/2;
        for(int i = 0; i < N; i++){
            X[i] = sc.nextInt();
        }
        sc.close();
        long ans = solve(0, N-1, 0);
        System.out.println(ans);

    }

    static long solve(int s, int e, int p){
        long res = 0;
        int sDist = p < X[s] ? X[s] - p : L - p + X[s];
        int eDist = p > X[e] ? p - X[e] : L - X[e] + p;
        if(s == e){
            res = Math.max(sDist, eDist);
        }else if(sDist >= h){
            p = X[s];
            s++;
            res = solve(s,e,p) + sDist;
        }else if(eDist >= h){
            p = X[e];
            e--;
            res = solve(s,e,p) + eDist;
        }else{
            long a = solve(s+1, e, X[s]) + sDist;
            long b = solve(s, e-1, X[e]) + eDist;
            if(a > b){
                res = a;
            }else{
                res = b;
            }
        }
        return res;
    }

}
