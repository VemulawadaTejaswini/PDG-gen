import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int a = sca.nextInt();
	int b = sca.nextInt();
	int c = sca.nextInt();
	double a_d = (double)a;
	double b_d = (double)b;
	double c_d = (double)c;

	double a_sq = Math.sqrt(a_d);
	double b_sq = Math.sqrt(b_d);
	double c_sq = Math.sqrt(c_d);

	if(a_sq + b_sq < c_sq) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}


	// 後始末
	sca.close();
	}
}