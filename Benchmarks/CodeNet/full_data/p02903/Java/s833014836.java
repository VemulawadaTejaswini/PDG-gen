import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < B; i++) {
			for(int j = 0; j < A; j++)
				ans.append("1");
			for(int j = A; j < W; j++)
				ans.append("0");
			ans.append("\n");
		}
		for(int i = B; i < H; i++) {
			for(int j = 0; j < A; j++)
				ans.append("0");
			for(int j = A; j < W; j++)
				ans.append("1");
			ans.append("\n");
		}
		System.out.print(ans);

	}

}