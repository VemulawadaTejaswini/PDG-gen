import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String color = sc.next();
			int N =color.length();
			
			int odd_0 = 0;
			int even_0 = 0;
			int odd_1 = 0;
			int even_1 = 0;
			
			
			for (int i=0;i<N;i=i+2) {
				if (color.charAt(i) == '0')
					odd_0+=1;
				else 
					odd_1=odd_1-1;
			}	
			
			for (int i=1;i<N;i=i+2) {
				if (color.charAt(i) == '0')
					even_0+=1;
				else 
					even_1=even_1-1;
			}
			
			
			int ans = Math.max(odd_0-even_1, even_0-odd_1);
			System.out.println(N-ans);
			
		}

	}
