import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nq = br.readLine().split(" ");
        int n = Integer.parseInt(nq[0]);
        int q = Integer.parseInt(nq[1]);
        String s = br.readLine();
        
        int count;
        for (int i = 0; i < q; i++) {
            count = 0;
            String[] lr = br.readLine().split(" ");
            int l = Integer.parseInt(lr[0]);
            int r = Integer.parseInt(lr[1]);
            for (int j = l-1; j < r-1; j++) {
                if (s.charAt(j) == 'A') {
                    if (s.charAt(j+1) == 'C') {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        
        
    }
}



