import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int min = 0;
        int colorNum = 0;

        for (int i = 0; i < n; i++) {
        	int a = input.nextInt();
        	if (i == 0) {
        		min = a;
        		colorNum++;
        	} else {
            	if (a <= min) {
            		min = a;
            		colorNum++;
            	}
        	}
        }

        System.out.println(colorNum);
    }
}
