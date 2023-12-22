import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int ans = 0;
        if (A / 100 == B / 100) {
            ans = 1;
        } else if (A / 1000 == B / 1000) {
            ans = B / 100 - A / 100 + 2;
        } else if (A / 10000 == B / 10000) {
            ans = B / 100 - A / 100 + 1;
        } else {
            ans = B / 100 - A / 100;
        }

        System.out.println(ans);
    }
}