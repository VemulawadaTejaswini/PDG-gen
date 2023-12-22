import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int nagasa = scan.nextInt();
		String moziS = scan.next();
		String moziT = scan.next();


		for(int i=0;i<nagasa;i++) {

			System.out.println(moziS.charAt(i) + moziT.charAt(i));
		}

		scan.close();

	}

}
