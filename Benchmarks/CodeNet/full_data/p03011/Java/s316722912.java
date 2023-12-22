import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		int r1 = A+B;
		int r2 = B+C;
		int r3 = C+A;
		
		int ans = Math.min(Math.min(r1, r2), r3);
	
		System.out.println(ans);
		
		in.close();
	}
}
