import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String argv[])
    {
        int N,K,i;
        try
        {
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            String[] nk=bf.readLine().split(" ");
            N=Integer.parseInt(nk[0]);
            K=Integer.parseInt(nk[1]);
            String[] da=bf.readLine().split(" ");

            System.out.println(solve(da,K));

        }
        catch(IOException e)
        {
            System.out.println(e);
            System.exit(0);
        }
    }
    private static int solve(String[] d,int X)
    {
        int c=0,i;
        for(i=0;i<d.length;i++)
        {
            c+=Integer.parseInt(d[i]);
            if(c>X)
                break;
        }
        return 1+i;
    }
}
