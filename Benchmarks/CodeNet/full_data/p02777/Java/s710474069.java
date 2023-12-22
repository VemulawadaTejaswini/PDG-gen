import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
		int A = sc.nextInt();
		int B = sc.nextInt();
		String U = sc.nextLine();
		
		if(U.equals(S)){
			A = A - 1;
		}
		else if(U.equals(T)){
			B = B - 1;
		}
		
		System.out.println(A+" "+B);
	}
}
