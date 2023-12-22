import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long solve[][] = new long[1001][1001];
    public static char grid[][] = new char[1001][1001];
    public static long H,W;
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String HW[]=br.readLine().split(" ");
        H=Long.parseLong(HW[0]);
        W=Long.parseLong(HW[1]);
        for(int i=0;i<H;i++)
        {
            for(int j=0;j<W;j++)
                solve[i][j]=-1;
        }
        solve[(int)H-1][(int)W-1]=1;
        for(int i=0;i<H;i++)
        {
            String S=br.readLine();
            for(int j=0;j<W;j++)
                grid[i][j]=S.charAt(j);
        }
        /*for(int i=0;i<H;i++)
        {
            for(int j=0;j<W;j++)
                System.out.print(grid[i][j]);
            System.out.println();
        }*/
        System.out.println(DP(0,0));
        /*System.out.println("\n\n\n");
        for(int i=0;i<H;i++)
        {
            for(int j=0;j<W;j++)
                System.out.print(solve[i][j]+" ");
            System.out.println();
        }*/
    }
    public static long DP(int x,int y)
    {
        if(solve[x][y]==-1)
        {
            if(x==H||y==W||grid[x][y]=='#')
                return 0;
            else
                solve[x][y]=DP(x,y+1)+DP(x+1,y);
        }
        return solve[x][y]%1000000007;
    }
}