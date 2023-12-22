import java.util.*;
import java.io.*;
public class Main
{
    static BufferedWriter bw;
    static BufferedReader br;
    static void solve()throws Exception
    {
        int n = Integer.parseInt(br.readLine());
        int A[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count[] = new int[n+1];
        for(int temp:A)
        {
            count[temp]++;
        }
        for(int i=1;i<count.length;i++)
        {
            bw.write(Integer.toString(count[i]));
            bw.newLine();
        }
    }
    public static void main(String []args)throws Exception
    {
        br=new BufferedReader(new InputStreamReader(System.in));
        bw=new BufferedWriter(new OutputStreamWriter(System.out));
        // int t = Integer.parseInt(br.readLine());
        // for(int i=0;i<t;i++)
        // {
        //     bw.write("Case #"+(i+1)+": ");
            solve();
        // }
        br.close();
        bw.close();
    }
}
