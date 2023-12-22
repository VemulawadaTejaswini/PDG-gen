	import java.util.*;
	
	
	
	public class Main {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			Integer a[] = new Integer[N];
			for (int i = 0;i<N;i++) {
				a[i] = sc.nextInt();
			}
			
			Arrays.sort(a,Collections.reverseOrder());
			
			int res = 1;
			
			for (int j = 1;j<N;j++) {
				if (a[j] < a[j-1]) {
					res++;
				}
			}
			
			System.out.println(res);
			
			sc.close();
		}
		
		
	}