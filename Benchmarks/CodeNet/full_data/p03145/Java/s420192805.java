import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int AB=sc.nextInt();
		int BC=sc.nextInt();
		int CA=sc.nextInt();

		System.out.print(AB*BC/2);

		sc.close();
	}

}