import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int ans = b;
        
        if (a <= 12) {
            ans /= 2;
            if (a <= 5) {
                ans = 0;
            }
        }
        

        System.out.println(ans);
    }
}



