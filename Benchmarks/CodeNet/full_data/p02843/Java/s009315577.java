import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=n/100,b=n%100;
		System.out.println(a*5>=b?1:0);
	}
}
