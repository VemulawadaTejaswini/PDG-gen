public class Main {
	
		public static void main(String[] args) {
			execute18_1();
		}
		
		private static void execute18_1() {
			try 
			(Scanner sc = new Scanner(System.in)) {
				int n = sc.nextInt();
				long[] t= new long[n];
				
				for(int i=0;i<n;i++) {
					t[i] = sc.nextLong();
				}
				
				long ans=t[0];
				
				for(int i=1;i<n;i++) {
					ans=k(ans, t[i]);
				}
				
			System.out.println(ans);
			}
		}
		
		private static long k(long x, long y) {
			long min = Math.min(x, y);
	        long max =Math.max(x, y);
	        if(max%y==0) return max;
	        long temp;
	        while ((temp = max % min) != 0) {
	            min = max;
	            max = temp;
	        }
	        return x*y/min;
		}
}