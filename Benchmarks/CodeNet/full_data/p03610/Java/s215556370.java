import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String SArray[] = S.split("");

		for(int i = 0; i < S.length(); i++) {
			if(i % 2 == 0) {
				System.out.print(SArray[i]);
			}
		}
	}

}