import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main
{
    static int mod=1000000007;
    static int dp[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[][]=new int[n][n];
        dp=new int[(1<<n)+1][n];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++)
//                for(int k=0;k<dp[0][0].length;k++)
                dp[i][j]=-1;
        for(int i=0;i<n;i++)
        {
            String str[]=br.readLine().split(" ");
            for(int j=0;j<str.length;j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }
        int man=((1<<n)-1);
        int woman=((1<<n)-1);
//        System.out.println(man);
        System.out.println(calculate(woman,arr,0));
    }

    private static int calculate(int woman, int[][] arr,int index) {
        if( woman==0 && index>=arr.length)
            return 1;
        if(index>=arr.length)
            return 0;
        if(dp[woman][index]!=-1)
            return dp[woman][index];
        int sum=0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[index][j] == 1 && ((woman >> j) & 1) == 1) {
                        sum = ((sum%mod)+(calculate( woman ^ (1 << j), arr, index + 1)%mod))%mod;
                    }
                }
        return dp[woman][index]=sum;
    }
}