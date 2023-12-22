import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int cost =0;
		if(A>=13) cost = B;
		else if(A<=12 && A>=6) cost = B/2;
		else if(A<=5) cost =0;

		System.out.print(cost);


	}

}
