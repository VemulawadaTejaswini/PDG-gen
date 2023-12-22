import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		
				
		if(A >= B && A >= C) {
			A = A*10;
		}else if(B >= A && B >= C) {
			B = B*10;
		}else if(C >= A && C >= B) {
			C = C*10;
		}
		System.out.println(A+B+C);
		in.close();
	}
}
