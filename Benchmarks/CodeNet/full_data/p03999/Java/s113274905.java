
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static String z;
    static ArrayList<String>arr ;


    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        z="";
        int n = word.length()-1;
        arr = new ArrayList<>();
        for(int i=0;i<word.length();i++){
            if(i!=word.length()-1)z+=word.charAt(i)+" ";
            else z+=word.charAt(i);
        }

        solve(0,n,"");
        long sum=0;
        for(String f : arr){
            String acc = "";
            for(int i=0;i<f.length();i++){
                if(f.charAt(i)=='+'){
                    sum+= Long.parseLong(acc);
                    acc="";
                }
                else {
                   acc+=f.charAt(i);
                }
            }
            sum+= Long.parseLong(acc);

        }
        System.out.println(sum);

    }

    public static void solve(int start, int n,String acc){
        if(start==n){
            String res="";
            for(int i=0,j=0;i<z.length();i++){
                if(z.charAt(i)==' '){
                    if(acc.charAt(j++)=='+')res+='+';
                }
                else res+=z.charAt(i);
            }

            arr.add(res);
        }
        else{
            solve(start+1,n,acc+" ");
            solve(start+1,n,acc+"+");
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