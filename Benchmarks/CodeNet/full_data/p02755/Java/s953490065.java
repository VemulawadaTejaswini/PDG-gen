import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		for(int i = 1; i <= 1250; i++) {
			if(Math.floor(i * 0.08) == A && Math.floor(i * 0.1) == B) {
				System.out.print(i);	
				sc.close();
				return;
			}
		}
		
		System.out.print(-1);		
		sc.close();
	}
	
}