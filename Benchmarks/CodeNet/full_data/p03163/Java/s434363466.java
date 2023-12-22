import java.util.*;

class Main {
    static int[][] dp;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), w=in.nextInt();
        dp=new int[w+1][n+1];

        for(int i=0;i<=w;i++){
            for(int j=0;j<=n;j++){
                if(i==0)
                    dp[i][j]=0;
                else
                    dp[i][j]=-1;
            }
        }

        int[][] wv = new int[n][2];

        for(int i=0;i<n;i++){
            wv[i][0] = in.nextInt();
            wv[i][1] = in.nextInt();
        }
        System.out.println(Math.max(maxValue(w, 0, true, wv), maxValue(w, 0, false, wv)));

    }

    public static long maxValue(int w, int ind,boolean include,int[][] wv){
        // if(dp[w][ind]!=-1)
        //     return dp[w][ind];
        if(ind>wv.length-1)
            return 0;
        if(include){
            if(wv[ind][0] > w)
                return dp[w][ind]=0;
            return wv[ind][1]+ Math.max(maxValue(w-wv[ind][0], ind+1,true,wv),maxValue(w-wv[ind][0], ind+1,false,wv));
        }
        else{
            return Math.max(maxValue(w, ind+1,true,wv),maxValue(w, ind+1,false,wv));
        }
    }
}