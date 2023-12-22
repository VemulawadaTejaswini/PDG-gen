import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		double min = Double.MAX_VALUE;
		double H[] = new double[N+1];
		int num = 1;
		for(int i = 1;i <= N;i++) {
			H[i] = Math.abs(A - (T - (sc.nextDouble() * 0.006)));
			if(min > H[i]) {
				min = H[i];
				num = i;
			}
		}
		System.out.println(num);
		sc.close();
	}
}