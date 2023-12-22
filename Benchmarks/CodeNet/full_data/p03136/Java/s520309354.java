import java.util.Scanner;
public class Main {

			public static void main(String[]args) {
			
				Scanner sc = new Scanner(System.in);
				int N = sc.nextInt();
				int max=0;
				int sum=0;
				int scan;
				
				for(int i =0; i<N; i++) {
					scan = sc.nextInt();
					if(scan>max) {
						sum += max;
						max = scan;
					}else {
						sum +=scan;
					}
				}
				if(max<sum)System.out.println("Yes");
				else System.out.println("No");
			}
}
