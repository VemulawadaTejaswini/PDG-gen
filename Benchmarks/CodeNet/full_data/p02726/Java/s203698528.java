import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String s[]=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int x=Integer.parseInt(s[1]);
        int y=Integer.parseInt(s[2]);
        int arr[][]=new int[n+1][n+1];
        //for(int i=0;i<=n;i++)
        //Arrays.fill(arr[i],500000);
        for(int i=1;i<n;i++)
        {
            arr[i][i+1]=1;
            arr[i+1][i]=1;
        }
        for(int i=1;i<=n;i++)
        arr[i][i]=0;
        arr[x][y]=1;
        int dist[][]=new int[n+1][n+1];
        for(int i=1;i<=n;i++)
        Arrays.fill(dist[i],500000);
        for(int i=1;i<=n;i++)
        {
            dist[i][i]=0;
            if(i!=n)
            {
                dist[i][i+1]=1;
                dist[i+1][i]=1;
            }
        }
        dist[x][y]=1;
        for(int k=1;k<=n;k++)
        {
            for(int i=1;i<n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(dist[i][k]+dist[k][j]<dist[i][j])
                        dist[i][j]=dist[i][k]+dist[k][j];
                }
            }
        }
        int cntr[]=new int[n+1];
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=n;j++)
            {
               // pw.print(dist[i][j]+" ");
                if(dist[i][j]<=n&&i<j)
                cntr[dist[i][j]]++;
            }
           // pw.println();
        }
        pw.println(n);
        for(int i=2;i<n-1;i++)
        pw.println(cntr[i]);
        pw.println(0);
        pw.flush();
        pw.close();
    }
}