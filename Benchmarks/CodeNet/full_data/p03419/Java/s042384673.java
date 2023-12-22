import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int nrow = Integer.parseInt(s[0]);
        int mcol = Integer.parseInt(s[1]);
        long ans;
        
        if (nrow == 2 || mcol == 2) {
            ans = 0;
        }
        else if (nrow > 2 && mcol > 2) {
            ans = (nrow-2) * (mcol-2);
        }
        else if (nrow == 1 && mcol == 1) {
            ans = 1;
        }
        else {
            ans = Math.max(nrow, mcol)-2;
        }
        
        System.out.println(ans);
    }
}



