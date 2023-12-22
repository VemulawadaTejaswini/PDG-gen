import java.io.*;
import java.util.*;
public class Main {
    
    static int n;
    static int a;
    static int b;
    static int[] x;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        a=Integer.parseInt(st.nextToken());
        b=Integer.parseInt(st.nextToken());
        x=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){ x[i]=Integer.parseInt(st.nextToken()); }
        int sum=0;
        for(int i=0;i<n-1;i++){
            if((x[i+1]-x[i])*a<b) sum+=(x[i+1]-x[i])*a;
            else sum+=b;
        }System.out.println(sum);
    }
}