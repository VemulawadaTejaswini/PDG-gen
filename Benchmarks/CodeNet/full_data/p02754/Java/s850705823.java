import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        int ans = 0;
        
        if(n % (a + b) >= b){
            ans = a * (n / (a + b)) + a;
        }else{
            ans = a * (n / (a + b)) + (n % (a + b));
        }
        
        out.println(ans);
        out.close();
        
    }
}