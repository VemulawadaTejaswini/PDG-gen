import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    static int count = 0;
    static char[] s;
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        s = new char[S.length()];
        
        for (int i = 0; i < s.length; i++) {
            s[i] = S.charAt(i);
        }
        //int count = 0;
        
        for (int i = 0; i < s.length-1; i++) {
            swap(i);
        }
        
        
        System.out.println(count);
        
    }
    
    static void swap(int i) {
        if (s[i] == 'B' && s[i+1] == 'W') {
            s[i] = 'W';
            s[i+1] = 'B';
            count++;
            if (i > 0) swap(i-1);
        }
    }
}
