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
        
        int l = L % 673;
        int r = R % 673;

        if (l == 0 || r == 0 || R - L >= 673 || l >= r) {
            ans = 0;
        } else {
            ans = l * (l + 1);
        }
        out.println(ans);
        out.close();
    }

}
