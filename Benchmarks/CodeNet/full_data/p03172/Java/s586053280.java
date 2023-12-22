import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Main
{
    long dp[][];
    int max[];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int child=sc.nextInt();
        int candles=sc.nextInt();
        sc.nextLine();
        Main object=new Main();
        object.dp=new long[child+1][candles+1];
        object.max=new int[child];
        object.dp[0][0]=1;
        for(int i=1;i<=child;i++)
        {
          object.max[i-1]=sc.nextInt();
          for(int j=0;j<=candles;j++)
          {
              int k=0;long ways=0;
              while(k<=j&&k<=object.max[i-1])
              {
                  ways=(ways+object.dp[i-1][j-k])%1000000007;
                  k++;
              }
              object.dp[i][j]=ways%1000000007;
          }
        }
        System.out.println(object.dp[child][candles]);
        sc.close();
     }
}