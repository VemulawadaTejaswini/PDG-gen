import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int sosu = scan.nextInt();

		while(!hantei(sosu)) {
			sosu++;
		}
			System.out.println(sosu);
		scan.close();

	}

	public static boolean hantei(int s) {


		if(s >= 2) {
		for(int i=2;i*i<=s;i++) {

			if(s%i == 0) {
				return false;
					}

			}
		}


		return true;

		}

}
