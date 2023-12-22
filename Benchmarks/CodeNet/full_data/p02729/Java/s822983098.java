import java.util.*;
		public class diamond{
			public static void main(String [] args) {
					Scanner sc = new Scanner(System.in);
					int n = sc.nextInt();
					int m = sc.nextInt();
					int count = combinations(n) + combinations(m);
					System.out.println(count);
			}

			private static int combinations(int n) {
				// TODO Auto-generated method stub
				if(n >= 2) {
					int prod = 1;
					prod = ((n-1)*n)/2;
					return prod;
				}
				return 0;
			}

		 }