import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int D[] = new int[K];
		for(int i = 0; i < K; i++) {
			D[i] = sc.nextInt();
		}
		outside : for(int i = N; i < 100000; i++) {
			for(int j = 0; j < String.valueOf(i).length(); j++) {
				for(int k = 0; k < K; k++) {
					if(String.valueOf(i).substring(j, j + 1).equals(String.valueOf(D[k]))) {
						continue outside;
					}
				}
			}
			System.out.println(i);
			return;
		}
	}
}
