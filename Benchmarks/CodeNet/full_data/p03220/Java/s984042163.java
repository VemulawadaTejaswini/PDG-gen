import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		double H[] = new double[N+1];
		int num = 1;
		for(int i = 1;i <= N;i++) {
			H[i] = sc.nextDouble();
			H[i] = Math.abs((T - H[i] * 0.006) - A);
		}
		double min = H[1];
		for(int i = 1;i <= N;i++) {
			if(min > H[i]) {
				num = i;
			}
		}
		System.out.println(num);
		sc.close();
	}
}