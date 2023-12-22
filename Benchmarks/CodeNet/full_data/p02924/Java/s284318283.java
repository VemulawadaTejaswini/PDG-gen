import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        int n = Integer.parseInt(line);

      	int ans = 0;
        for (int i = 1; i < n; i++) {
            ans += i;
        }
      	System.out.println(ans);
    }
}