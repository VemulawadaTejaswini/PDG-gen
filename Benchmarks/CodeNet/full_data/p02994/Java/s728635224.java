import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int l = Integer.parseInt(in[1]);

        int[] taste = new int[n];
        int sum = 0;
        int min = 1000000000;
        int ans = -1;
        for(int i = 0; i < n; i++) {
            taste[i] = l + i;
            sum += taste[i];
        }

        for(int i = 0; i < n; i++) {
            int tmp = Math.abs(taste[i]);
            if(tmp < min) {
                min = tmp;
                ans = i;
            }
        }

        System.out.println(sum - taste[ans]);
    }
}