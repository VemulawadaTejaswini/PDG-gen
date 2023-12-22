import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    static long dp[][]=new long[10][3];
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        int br[][]=new int[t][3];
        for(int i=0;i<t;i++)
        {
            br[i][0]=sc.nextInt();
            br[i][1]=sc.nextInt();
            br[i][2]=sc.nextInt();
        }

        long te=vac(br,0,-1);
        //for(int i=0;i<=t;i++)
       // System.out.println(Arrays.toString(dp[i]));
        System.out.println(Math.max(Math.max(dp[0][0],dp[0][1]),dp[0][2]));
        }

    public static long vac(int br[][],int i,int ls)
    {
        //for(int p=0;p<3;p++)
          //  System.out.println(Arrays.toString(dp[p]));

        if(i>=br.length)
            return 0;
        if(ls!=-1&&dp[i][ls]!=0)
        {
            return dp[i][ls];
        }
        if(ls==0)
        {
            long r1=br[i][1]+vac(br,i+1,1);
            long r2=br[i][2]+vac(br,i+1,2);
            dp[i][ls]=Math.max(r1,r2);

        }
        else if(ls==1)
        {
            long r1=br[i][0]+vac(br,i+1,0);
            long r2=br[i][2]+vac(br,i+1,2);
            dp[i][ls]= Math.max(r1,r2);
        }
        else if(ls==2)
        {
            long r1=br[i][0]+vac(br,i+1,0);
            long r2=br[i][1]+vac(br,i+1,1);
            dp[i][ls]= Math.max(r1,r2);
        }
        else
        {
            dp[i][0]=br[i][0]+vac(br,i+1,0);
            dp[i][1]=br[i][1]+vac(br,i+1,1);
            dp[i][2]=br[i][2]+vac(br,i+1,2);
            //dp[i]=Math.max(Math.max(r1,r2),r3);
        }
        if(ls!=-1)
        return dp[i][ls];
        else
            return dp[i][0];
    }
}
