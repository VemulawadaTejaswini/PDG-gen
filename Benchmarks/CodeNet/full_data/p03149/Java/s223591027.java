import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[4];
		String ans = "NO";
		for(int i = 0; i < 4; i++) {
			n[i] = sc.nextInt();
		}
		Arrays.sort(n);
		if(n[0] == 1 && n[1]== 4) {
			if(n[2] == 7 && n[3] == 9) {
				ans = "YES";
			}
		}
		System.out.println(ans);
		sc.close();
	}
}

