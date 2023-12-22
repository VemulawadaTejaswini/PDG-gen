import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int numberA=sc.nextInt();
		int numberB=sc.nextInt();
		int T=sc.nextInt();

		int sum=(T/numberA)*numberB;
		System.out.println(sum);
		sc.close();
	}

}