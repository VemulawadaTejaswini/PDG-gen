import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main
{
    static long dp[][][];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        dp=new long[str.length+1][str.length+1][2];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++)
                for(int k=0;k<dp[0][0].length;k++)
                    dp[i][j][k]=-Long.MIN_VALUE;
        int arr[]=new int[str.length];
        for(int i=0;i<str.length;i++)
            arr[i]=Integer.parseInt(str[i]);
        System.out.println(calculate(arr,0,arr.length-1,0));
    }

    private static long calculate(int[] arr, int i, int j, int turn) {
        if(i>j)
            return 0;
        if(dp[i][j][turn]!=Long.MIN_VALUE)
            return dp[i][j][turn];
        if(turn==0)
        {
            return dp[i][j][turn]= Math.max(arr[i]+calculate(arr,i+1,j,1),arr[j]+calculate(arr,i,j-1,1));
        }
        else
            return dp[i][j][turn]= Math.min(-arr[i]+calculate(arr,i+1,j,0),-arr[j]+calculate(arr,i,j-1,0));
    }
}