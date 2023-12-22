import java.util.*;
import java.io.*;

public class Main {
    
    static int m;
    static int n;
    static ArrayList<Integer>[] next;
    static boolean[] dp;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st=new StringTokenizer(br.readLine());
        Long x=Long.parseLong(br.readLine());
        Long sum=0L;
        sum+=(x/11)*2;
        x%=11;
        if(x>0){ sum+=(x>5) ? 2:1; }
        System.out.println(sum);
    }
    
}
