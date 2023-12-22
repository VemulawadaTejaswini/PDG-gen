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
        long t_n=n;
        long t_x=x;
        while(n!=x){
            if(n>x){ n-=x; }
            else{ x-=n; }
        }System.out.println((t_n-n)*3);
    }
}
