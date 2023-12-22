import java.util.Scanner;

public class  summerwork {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = new java.util.Scanner(System.in).nextInt();
		int m = new java.util.Scanner(System.in).nextInt();
		//int a = 0; //= new java.util.Scanner(System.in).nextInt();
		
		for(int i = 0; i <= m; i ++) {
			int a = new java.util.Scanner(System.in).nextInt();
			
			int sum = n - a;
		
			if(n > 0) {
			System.out.println(sum);
			}
			else if(n < 0) {
				System.out.println(-1);
			}
		}
	}
}