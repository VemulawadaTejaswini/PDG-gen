import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int rest = N % (A + B);
		int divide = Math.floorDiv(N, A + B);
		
		if(rest < A) {
			System.out.print(A * divide + rest);
		}else {
			System.out.print(A * divide + A);
		}
		sc.close();
	}
	
}