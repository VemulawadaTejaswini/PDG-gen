//
import java.math.*;
import java.util.*;
import java.io.*;
  
public class Main { 
  
    static BufferedReader in;
    static String file = "../in";

    public static void main(String[] args) throws Exception
    {
        int test = 10,   // 0 for local testing, 1 for std input
            _k = Integer.valueOf("1");
        if(test > 0) in = new BufferedReader(new InputStreamReader(System.in));
        else in = new BufferedReader(new FileReader(file));
        if(test < 0) {String[] str = in.readLine().split(" ");}

        new Main().c();

    }

    void d() throws Exception
    {

    }
    void c() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int n = Integer.valueOf(sp[0]),
            m = Integer.valueOf(sp[1]);
        int[] wa = new int[n + 1];
        boolean[] ac = new boolean[n + 1];
        for(int i = 0; i < m; i++)
        {
            sp = in.readLine().split(" ");
            int q = Integer.valueOf(sp[0]);
            if(sp[1].equals("WA"))
            {
                if(!ac[q]) wa[q]++;
            }
            else
            {
                if(!ac[q]) ac[q] = true;
            }
        }
        int acount = 0, wcount = 0;
        for(int i = 1; i <= n; i++)
        {
            if(ac[i])
            {
                acount++;
                wcount += wa[i];
            }
        }
        System.out.printf("%d %d\n", acount, wcount);
        
    }
    void b() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int n = Integer.valueOf(sp[0]),
            k = Integer.valueOf(sp[1]),
            m = Integer.valueOf(sp[2]);
        sp = in.readLine().split(" ");
        int sum = m * n;
        for(int i = 0; i < n - 1; i++) {
            sum -= Integer.valueOf(sp[i]);
        }
        if(sum <= k) System.out.println(Math.max(0, sum));
        else System.out.println(-1);
    }

    void a() throws Exception
    {
        char c = in.readLine().charAt(0);
        System.out.println((char)(c + 1));
    }
}