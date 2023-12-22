import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        String[] sp = new String[n];

        for (int i = 0; i < n; i++) {
            String city = scan.next();
            int point = scan.nextInt();
            sp[i] = city + "," + (1100 - point) + "," + (i+1);
        }
        scan.close();
        Arrays.sort(sp);
        for (String s: sp) {
            String ans = s.split(",")[2];
            System.out.println(ans);
        }
	}
}