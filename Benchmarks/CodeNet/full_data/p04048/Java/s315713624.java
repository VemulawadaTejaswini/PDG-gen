import java.util.*;
import java.io.*;

public class Main {
    
    static String str;
    static int t;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        long n=Long.parseLong(st.nextToken());
        long x=Long.parseLong(st.nextToken());
        long gcd=1;
        long t_n=n;
        while(true){
            if(n>x){
                n=n%x;
                if(n==0){ gcd=x; break; }
            }
            else{
                x=x%n;
                if(x==0){ gcd=n; break; }
            }
        }System.out.println((t_n-gcd)*3);
    }
}
