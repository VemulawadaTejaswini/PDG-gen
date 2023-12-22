import java.util.Scanner;
public class Main {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		int N = 0;
		boolean j = false;

		N = sc.nextInt();

		for(int x = 1;x <= 9;x++) {
			for(int y = 1;y <=9;y++) {
				if(N == x*y) {
					j = true;
				}
			}
		}
		if(j == true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}