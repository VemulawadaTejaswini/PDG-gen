import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextInt();
		double a = 0;
		if(N==1) {
			a = 1;
		}else if(N%2==0) {
			a = 0.5;
		}else {
			double b = (N+1)/2;
			a = b/N;
		}
		System.out.println(a);
	}

}
