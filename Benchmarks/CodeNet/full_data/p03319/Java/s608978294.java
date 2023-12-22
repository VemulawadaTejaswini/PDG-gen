import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int Ai = sc.nextInt();
		}
		int index = 0;
		while (0 < N) {
			if (index == 0) {
				N -= K;
			} else {
				N -= (K-1);
			}
			index++;
		}
		System.out.println(index);
	}
}