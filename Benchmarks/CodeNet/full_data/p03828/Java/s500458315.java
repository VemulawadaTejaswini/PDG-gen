import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		List<String> divisor = new ArrayList<>();
//		int[] in = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = Integer.parseInt(sc.next());
//		int S = Integer.parseInt(sc.next());
//		String[] S = sc.next().split("");
		
//		for (int i = 1; i <= N; i++) {
//		}
		
		long mod = 1_000_000_007;
		int[] n = new int[N+1];
		for(int i = 1;i <= N; i++) {
			int num = i;
			for(int j = 2;j <=num; j++) {
				while(num % j == 0) {
					n[j]++;
					num /= j;
				}
			}
		}
		
		long res = 1;
		for(int i = 0; i <= N; i++) 
			res = (res*(n[i]+1)) % mod ;
		
		System.out.println(res);		
	}
}
