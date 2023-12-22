import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count;
        int max = 0;
        int ans = 1;
        int a;
        
        for (int i = 2; i <= n; i++) {
            a = i;
            count = 0;
            while (a % 2 == 0) {
                count++;
                a /= 2;
            }
            if (count > max) {
                max = count;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
