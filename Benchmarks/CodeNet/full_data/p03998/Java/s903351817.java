
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String word1= s.next(),word2=s.next(),word3=s.next();
        Queue<Character>q1 = new ArrayDeque<>();
        Queue<Character>q2 = new ArrayDeque<>();
        Queue<Character>q3 = new ArrayDeque<>();
        for(int i=0;i<word1.length();i++)q1.add(word1.charAt(i));
        for(int i=0;i<word2.length();i++)q2.add(word2.charAt(i));
        for(int i=0;i<word3.length();i++)q3.add(word3.charAt(i));
        char  g = 'a';
        while(true){
            if(g=='a'){
                if(q1.isEmpty()){
                    System.out.println('A');
                    break;
                }
                else{
                    g = q1.poll();
                }
            }
            else if(g=='b'){
                if(q2.isEmpty()){
                    System.out.println('B');
                    break;
                }
                else{
                    g = q2.poll();
                }
            }
            else{
                if(q3.isEmpty()){
                    System.out.println('C');
                    break;
                }
                else{
                    g = q3.poll();
                }
            }
        }




    }

}




class Scanner
{
    StringTokenizer st;
    BufferedReader br;

    public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

    public String next() throws IOException
    {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public int nextInt() throws IOException {return Integer.parseInt(next());}

    public long nextLong() throws IOException {return Long.parseLong(next());}

    public String nextLine() throws IOException {return br.readLine();}

    public double nextDouble() throws IOException
    {
        String x = next();
        StringBuilder sb = new StringBuilder("0");
        double res = 0, f = 1;
        boolean dec = false, neg = false;
        int start = 0;
        if(x.charAt(0) == '-')
        {
            neg = true;
            start++;
        }
        for(int i = start; i < x.length(); i++)
            if(x.charAt(i) == '.')
            {
                res = Long.parseLong(sb.toString());
                sb = new StringBuilder("0");
                dec = true;
            }
            else
            {
                sb.append(x.charAt(i));
                if(dec)
                    f *= 10;
            }
        res += Long.parseLong(sb.toString()) / f;
        return res * (neg?-1:1);
    }

    public boolean ready() throws IOException {return br.ready();}


}