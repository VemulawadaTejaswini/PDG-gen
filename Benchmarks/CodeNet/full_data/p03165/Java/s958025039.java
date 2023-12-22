import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char[] arr1 = in.nextLine().toCharArray();
        char[] arr2 = in.nextLine().toCharArray();
        in.close();
        StringBuilder sb = new StringBuilder();
        int len1 = arr1.length, len2 = arr2.length;
        
        int[][] dp = new int[len1+1][len2+1];
        int[] res = new int[len1+1];
        int maxl = 0;
        for(int i = 1; i <= len1; i++)
        {
            for(int j = 1; j <= len2; j++)
            {
                if(arr1[i-1] == arr2[j-1])
                {   
                    dp[i][j] = 1 + dp[i-1][j-1];
                    if(dp[i][j] > maxl){
                        sb.append(arr1[i-1]);
                        maxl = dp[i][j];    
                    }
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        // System.out.println(dp[len1][len2]);
        System.out.println(sb.toString());
    }
}