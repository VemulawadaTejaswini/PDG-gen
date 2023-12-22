import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mod = 1_000_000_007;
        
        //約数
        ArrayList<Integer> mfac = new ArrayList<>();
        
        for(int i=1; i*i<=m; i++){
            if(m%i==0){
                mfac.add(i);
                if(i*i!=m){
                    mfac.add(m/i);
                }
            }
        }
        
        int[] f = mfac.stream().mapToInt((Integer i)->i).toArray();
        Arrays.sort(f);
        
        //
        for(int i=0; i<f.length; i++){
            //System.out.println(f[i]);
        }
        //
        
        //DPする
        long[][] dp = new long[2][f.length];
        dp[0][0] = 1L;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<f.length; j++){
                //System.out.println("j"+j);
                for(int k=0; k<f.length; k++){
                    int idx = bs(f, f[j]*f[k]);
                    //System.out.println(idx);
                    if(f.length <= idx) continue;
                    dp[1][idx] += dp[0][k];
                    dp[1][idx] %= mod;
                }
                /*
                for(int k=0; k<dp[0].length; k++){
                    System.out.println("i:" + k +"   val:" + dp[1][k]);
                }
                */
            }
            for(int j=0; j<f.length; j++){
                dp[0][j] = dp[1][j]%mod;
                dp[1][j] = 0;
            }
        }
        
        /*
        for(int i=0; i<dp[0].length; i++){
            System.out.println("i:" + i +"   val:" + dp[0][i]);
        }*/
        
        System.out.println(dp[0][dp[0].length-1]);
        
    }
    
    public static int bs(int[] f, int key){
        int result = Arrays.binarySearch(f, key);
        int idx = (result >= 0) ? result : 1_000_000_000;
        return idx;
    }
}
