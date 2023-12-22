import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		if(n%2==0)
		System.out.println(0.5);
		else if(n==1)
			System.out.println(1);
		else
			System.out.println(0.6);


	}
}