import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int S = sc.nextInt();
		int Z;
		int sum = 0;
		for(Z=0;Z<=K;Z++){
			S -= Z;
			sum += S + 1;
			S += Z;
		}
		System.out.println(sum);
	}
}