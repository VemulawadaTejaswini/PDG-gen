import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 0;
		
		for(int i = 0; i < n ;i++) {
			int a = sc.nextInt();
			
			while(a % 2 == 0) {
				a = a/2;
				count++;
			}
		}
		System.out.println(count);
	}
}
