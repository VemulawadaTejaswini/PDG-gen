import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[5];
        int ans = 0;
        int x = 10;
        for(int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(br.readLine());
            ans += Math.ceil(1.0 * a[i] / 10) * 10;
            int tmp = a[i] % 10;
            if(tmp == 0) continue;
            x = Math.min(x, tmp);
        }

        System.out.println(ans - 10 + x);
    }
}