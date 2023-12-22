import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int plan1 = T * A;
		
		if(plan1 > B)
			System.out.println(B);
		else
			System.out.println(plan1);
		sc.close();
	}
}
