public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			long ways = 0;
			long n = sc.nextInt();
			long x = sc.nextInt();
			if(n == 0 && x == 0) break;
			for(long i = 1;i <= n -2;i++) {  
				for(long j = i + 1;j <= n - 1;j++) {  
					for(long k = j + 1;k <= n;k++) {
						if(i + j + k == x)ways++;
					}
				}
			}
			System.out.println(ways);
		}
	}
}
