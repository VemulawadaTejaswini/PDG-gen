import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L[] = new int[N];
		int max = 0;
		int n = 0;
		for(int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
			if(max < L[i]) {
				max = L[i];
				n = i;
			}
		}
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
			if(i == n) continue;
			sum += L[i];
		}
		
		if(max < sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
