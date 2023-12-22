import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        char[] s = br.readLine().toCharArray();
        
        for(int i = 0; i < s.length; i++){
            if(s[i] + n <= 90){
                s[i] += n;
            }else{
                s[i] = (char)(65 + (n - (90 - s[i])) - 1);
            }
            out.print(s[i]);
        }
        
        out.close();
        
    }
}