import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		int H[] = new int[N + 1];
		int num = 1;
		for(int i = 1;i < N + 1;i++) {
			H[i] = sc.nextInt();
			H[i] = (int)Math.abs(T - H[i] * 0.006);
			H[i] = Math.abs(H[i] - A);
			if(H[i] < H[i-1]) {
				num = i;
			}
		}
		System.out.println(num);
		sc.close();
	}
}