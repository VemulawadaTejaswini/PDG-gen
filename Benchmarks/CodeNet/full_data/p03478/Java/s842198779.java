	import java.util.*;
	
	
	
	public class Main {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int A= sc.nextInt();
			int B = sc.nextInt();
			int res = 0;
			
			for (int i=1;i<=N;i++) {
				int i1 = i%10;
				int i2 = i/10;
				int i3 = i/100;
				int i4 = i/1000;
				int i5 = i/10000;
				int sum = i1+i2+i3+i4+i5;
				if (A<=sum && sum <=B) {
					res = res + i;
					}
			}
			System.out.println(res);
			
			sc.close();
		}
		
	}
