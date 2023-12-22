import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    int N;
    int[] P, Q;

    int cmp(int[] a, int[] b){
        for(int i=0; i<N; i++){
            if(a[i] < b[i]) return -1;
            else if(a[i] > b[i]) return 1;
        }
        return 0;
    }

    void next_permutation(int[] as){
        int i = N - 1;
        while(i-1>=0 && as[i-1] > as[i])i--;
        int j = i;
        Arrays.sort(as, i, N);
        while(j < N && as[j] < as[i-1])j++;
        int t = as[j]; as[j] = as[i-1]; as[i-1] = t;
        Arrays.sort(as, i, N);
    }

    int solve(){
        int f = cmp(P, Q);
        if(f == 0) return 0;
        if(f > 0){
            int[] t = P; P = Q; Q = t;
        }
        int a = 0;
        while(cmp(P, Q) < 0){
            next_permutation(P);
            a++;
        }

        return a;
    }

    public void _main() throws Exception {
        //System.setIn(new FileInputStream("/home/zxt/workspace/contest/inputs/c.in"));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(in.readLine());
        P = new int[N]; Q = new int[N];
        String[] ss;
        ss = in.readLine().split(" ");
        for(int i=0; i<N; i++){
            P[i] = Integer.parseInt(ss[i]);
        }

        ss = in.readLine().split(" ");
        for(int i=0; i<N; i++){
            Q[i] = Integer.parseInt(ss[i]);
        }

        System.out.println(solve());
    }

    public static void main(String[] args) throws Exception {
        Main s = new Main();
        s._main();
    }
}