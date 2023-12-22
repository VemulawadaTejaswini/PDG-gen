import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int ans = 0;

        String[] arr = br.readLine().split(" ");
        int L = Integer.parseInt(arr[0]);
        int R = Integer.parseInt(arr[1]);
        
        int l = L % 2019;
        int r = R % 2019;

        if (l == 0 || r == 0 || R - L >= 2019 || l >= r) {
            ans = 0;
        } else {
            ans = l * (l + 1);
        }
        out.println(ans);
        out.close();
    }

}
