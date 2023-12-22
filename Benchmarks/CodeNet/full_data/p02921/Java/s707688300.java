import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        String t = br.readLine();
        int ans = 0;
        
        if(s.charAt(0) == t.charAt(0)) ans++;
        if(s.charAt(1) == t.charAt(1)) ans++;
        if(s.charAt(2) == t.charAt(2)) ans++;
        
        out.println(ans);
        out.close();
        
    }
}