import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main (String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        long S = Long.parseLong(lines[0]);
        long C = Long.parseLong(lines[1]);
        
        long ans = Math.min(S,C/2);
        
        S -= ans;
        C -= ans*2;
        
        ans += C/4;
        
        System.out.println(Long.toString(ans));
    }
}