import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		if(Math.abs(C-A) <= D || (Math.abs(B-A) <= D && Math.abs(C-B) <= D)) System.out.println("Yes");
		else System.out.println("No");
	}
}