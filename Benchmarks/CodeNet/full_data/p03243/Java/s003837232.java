import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] contests = {111, 222, 333, 444, 555, 666, 777, 888, 999};
        int ans = 111;
        
        for (int i = 0; i < contests.length; i++) {
            if (n <= contests[i]) {
                ans = contests[i];
                break;
            }
            
        }
        
        System.out.println(ans);
    }
}
