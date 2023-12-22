import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[]a = new int[N];
			for(int i = 0;i<N;i++)a[i] = scan.nextInt();
			int saisyou = N;
			int count = 1;
			int nokosu = 0;
			
			
			for(int i=0;i<N;i++) {
				if(a[i]==count) {
					saisyou--;
					count++;
				}
			}
			
			System.out.println(saisyou==N?-1:saisyou);
			
		}
		
		
	}
		

}
