import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

class Main {
    public static long res=Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] lo = reader.readLine().split(" ");
        int N = Integer.parseInt(lo[0]);
        int W = Integer.parseInt(lo[1]);
        int[][] hm = new int[N][2];
        for (int i = 0; i <N ; i++) {
            String[] po = reader.readLine().split(" ");
            int w = Integer.parseInt(po[0]);
            int v = Integer.parseInt(po[1]);
            hm[i][0] = w;
            hm[i][1] = v;
        }
        Arrays.sort(hm,(a,b)-> a[0]-b[0]);
        solverec(W,hm,0,0);
        System.out.println(res);
    }

    private static void solverec(int weight_rem,int[][] hm,int ind, long res1) {
        if(ind==hm.length) res=Math.max(res,res1);
        else{
            if(weight_rem>=hm[ind][0]) {
                solverec(weight_rem,hm,ind+1,res1);
                solverec(weight_rem-hm[ind][0],hm,ind+1,res1+hm[ind][1]);
            }
            else{
                res=Math.max(res,res1);
                return;
            }
        }
    }
}
