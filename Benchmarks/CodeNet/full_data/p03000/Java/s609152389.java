import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int x = input.nextInt();

        int cnt = 1;
        int lsum = 0;

        for (int i = 0; i < n; i++) {
        	int l = input.nextInt();
        	lsum += l;
        	if (lsum <= x) {
        		cnt++;
        	}
        }

        System.out.println(cnt);

    }
}
