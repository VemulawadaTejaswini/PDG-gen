import java.util.*;
public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); 
		int B = sc.nextInt(); 
		int C = sc.nextInt();
		int K = sc.nextInt();
		
		if(A > B && A > C){
			A = A*(2^K);
		}
		if(B > A && B > C){
			B = B*(2^K);
		}
		if(C > A && C > B){
			C = C*(2^K);
		}
		int S = A + B + C;
		System.out.println(S);
	}
}

