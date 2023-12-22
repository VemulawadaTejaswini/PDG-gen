import java.util.*;

class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = Integer.parseInt( a + "" + b );
		
		int d = (int) Math.sqrt(c);
		
		System.out.println( c == d * d ? "Yes" : "No" );
	}
}
