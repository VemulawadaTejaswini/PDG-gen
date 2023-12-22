import java.util.*;


class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int A =  sc.nextInt();
		int B =  sc.nextInt();
		int C =  sc.nextInt();
		int D =  sc.nextInt();
		
		int total = Math.min(A,B) + Math.min(C,D);
		
		System.out.println(total);
	}
}
