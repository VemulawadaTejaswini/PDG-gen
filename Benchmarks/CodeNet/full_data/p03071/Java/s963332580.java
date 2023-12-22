import java.util.Scanner;

public class Main {
	private static void p(String s) {System.out.println(s);}
	static Scanner sc = new Scanner(System.in);
	static int a,b,c,n,m;
	public static void main(String[] args) {
		a=sc.nextInt();
		b=sc.nextInt();
		int max=Math.max(a, b);
		int min=Math.min(a,b);
		int ans=max+Math.max(max-1, min);
		p(""+ans);
	}
}
