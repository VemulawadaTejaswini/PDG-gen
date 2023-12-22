import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();

		double k;

		if(a==b) {
			System.out.println("0");
		}else {
			k=(a*a-b*b)/(2*a-2*b);
			if(k%1==0) {
				System.out.println((int)k);
			}else {
				System.out.print("IMPOSSIBLE");
			}
		}

	}
}
