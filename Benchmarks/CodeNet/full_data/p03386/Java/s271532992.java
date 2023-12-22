import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		int val = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < k && a + i <= b; i++) {
			sb.append(a + i).append("\n");
			val = a + i;
		}
		for (int i = k - 1; i >= 0; i--) {
			int x = b - i;
			if (x <= val) {
				continue;
			}
			sb.append(x).append("\n");;
		}
		System.out.print(sb);
	}
}
