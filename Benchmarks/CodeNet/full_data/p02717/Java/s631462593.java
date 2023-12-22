import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int temp;
		int temp2;
		//AとB
		temp = A;
		A = B;
		B = temp;
		
		//AとC
		temp2 = A;
		A = C;
		C = temp2;
		
		System.out.println(A + " " + B + " " + C);
	}

}
