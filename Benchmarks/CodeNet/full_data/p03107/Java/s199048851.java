import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int count0 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') count0++;
        }
        
        System.out.println(Math.min(count0, s.length()-count0)*2);
    }
}



