import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        int ans = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(arr[i]);
            if (max <= a) {
                ans++;
                max = a;
            }
        }
        out.println(ans);
        out.close();
    }
}
