import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int lNum = s.nextInt();
		int rNum = s.nextInt();

		int min = 2019;

		for(int i = lNum; i <= rNum; i++) {
			for(int j = i+1; j <= rNum ;j++) {
				int amari = (i * j)% 2019;
				if(amari < min) {
					min = amari;
				}
			}
		}
		System.out.println(min);

	}

}
