import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] abk = br.readLine().split(" ");
        int a = Integer.parseInt(abk[0]);
        int b = Integer.parseInt(abk[1]);
        int k = Integer.parseInt(abk[2]);
        
        
        for (int i = 0; i < k; i++) {
            if (i % 2 == 0) {
                if (a % 2 != 0) {
                    a--;
                }
                a /= 2;
                b += a;
            }
            else {
                if (b % 2 != 0) {
                    b--;
                }
                b /= 2;
                a += b;
            }
        }
        
        System.out.println(a + " " + b);
    }
}
