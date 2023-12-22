import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        
        for (int i = 0; i < t; i++) {
            String[] abcd = br.readLine().split(" ");
            long a = Long.parseLong(abcd[0]);
            long b = Long.parseLong(abcd[1]);
            long c = Long.parseLong(abcd[2]);
            long d = Long.parseLong(abcd[3]);
            long initial = a;
            boolean flag = false;
            //boolean[] memo = new boolean[1000000000000000001L];
            List<Long> memo = new ArrayList<Long>();
            
            while (a - b >= 0) {
                a -= b;
                if (a <= c) a += d;
                if (memo.contains(a)) {
                    flag = true;
                    break;
                }
                memo.add(a);
            }
            System.out.println(flag?"Yes":"No");
        }
    }
}
