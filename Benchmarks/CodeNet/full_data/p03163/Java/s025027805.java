import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long solve[][] = new long[101][100001];
    public static int weights[] = new int[100];
    public static int value[] = new int[100];
    public static long n,w;
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nw[]=br.readLine().split(" ");
        n=Long.parseLong(nw[0]);
        w=Long.parseLong(nw[1]);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=w;j++)
                solve[i][j]=-1;
        }
        for(int j=0;j<=w;j++)
            solve[(int)n][j]=0;
        for(int i=0;i<n;i++)
        {
            String S[]=br.readLine().split(" ");
            weights[i]=Integer.parseInt(S[0]);
            value[i]=Integer.parseInt(S[1]);
        }
        System.out.println(DP(0,(int)w));
        //System.out.println("\n\n\n");
        /*for(int i=0;i<n;i++)
        {
            for(int j=0;j<=w;j++)
                System.out.println(solve[i][j]);
        }*/
    }
    public static long DP(int x,int remainingCapacity)
    {
        if(solve[x][remainingCapacity]==-1)
        {
            if(remainingCapacity>=weights[x])
                solve[x][remainingCapacity]=Math.max(DP(x+1,remainingCapacity),(DP(x+1,remainingCapacity-weights[x])+value[x]));
            else
                solve[x][remainingCapacity]=DP(x+1,remainingCapacity);
        }
        return solve[x][remainingCapacity];
    }
}