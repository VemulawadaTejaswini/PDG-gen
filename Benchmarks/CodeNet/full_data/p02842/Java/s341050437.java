import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int a = (int)Math.ceil(b/1.08);
		if(taxout(b,a) != 0)System.out.println(a);
		else System.out.println(":(");
	}
	
	static int taxin(int a) {
		int b = (int)(a*1.08);
		return b;
	}
	
	static int taxout(int b, int a) { //aが元の値
		if(b == taxin(a)) return a;
		else return 0;
	}
}