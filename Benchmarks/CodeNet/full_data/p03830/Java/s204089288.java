
import java.util.*;
public class Main {
	public static void main(String[] args){
		// get numbers
		Scanner sc = new Scanner(System.in);     
        int N = sc.nextInt();
        int x = 1, y = 0, z = 0, ans = 0;

        for (int i = 2; i < N; i++) {
            for (int j = 2; j <= i; j++) {
                y = i;
                z = 0;
                while (y >= j) {
                    if (y % j == 0) {
                        y = y / j;
                        z++;
                    } else {
                        y = 0;
                    }
                }
                x = x * (z + 1);
            }
            ans += x;
            x = 1;
        }
        ans += N;

        // output
        System.out.println(ans);
        sc.close();
	}
}