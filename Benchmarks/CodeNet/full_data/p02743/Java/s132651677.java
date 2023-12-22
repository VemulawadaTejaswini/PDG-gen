import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		double roota = Math.sqrt(a);
		double rootb = Math.sqrt(b);
		double rootc = Math.sqrt(c);
		if(roota + rootb < rootc){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
