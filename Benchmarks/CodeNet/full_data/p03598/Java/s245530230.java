import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            ans += 2 * Math.min(x, Math.abs(k-x));
        }
        sc.close();
        out.println(ans);
        out.flush();
	}
}