import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = Integer.parseInt(scanner.nextLine());
		int K = Integer.parseInt(scanner.nextLine());
		
		int num = 1;
		for (int i=0; i<N; i++) {
			
			if (mul(num) < add(num, K)) {
				num = mul(num);
			} else {
				num = add(num, K);
			}
		}
		
		System.out.println(num);
	}
	
	static int mul(int n) {
		return 2*n;
	}
	
	static int add(int n, int k) {
		return n + k;
	}
}
