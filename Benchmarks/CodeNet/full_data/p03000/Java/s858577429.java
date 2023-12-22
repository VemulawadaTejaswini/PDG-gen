import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int x = Integer.parseInt(in[1]);

        int[] l = new int[n];
        in = br.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(in[i]);
        }

        int sum = 0;
        int ans = 1;
        for(int i = 0; i < n; i++) {
            sum += l[i];
            if(sum <= x) ans++;
            else break;
        }
        System.out.println(ans);
    }
}