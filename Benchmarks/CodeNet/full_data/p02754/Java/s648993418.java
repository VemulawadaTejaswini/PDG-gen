import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.next();
		int A = sc.next();
		int B = sc.next();
		
		
		int Ans = N % (A + B);
		
		if(A < Ans){
			A += Ans;
		}
		else if(A >= Ans){
			A += A;
		}
		System.out.println(A);
	}
}
