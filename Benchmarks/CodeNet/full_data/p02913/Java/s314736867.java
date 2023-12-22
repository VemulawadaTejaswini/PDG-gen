import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String s = bf.readLine();

        int max = 0;

        for(int i=0; i<s.length()-1; i++) {
            for(int j=i; j<s.length()-1; j++) {
                String sub = s.substring(i, j);
                String after = s.substring(j, s.length());
                if(after.contains(sub)) {
                    max = Math.max(max, sub.length());
                } else break;
            }
        }
        System.out.println(max);
    }
}