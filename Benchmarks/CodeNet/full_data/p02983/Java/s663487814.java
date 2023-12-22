import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int lNum = s.nextInt();
		int rNum = s.nextInt();
		int ldim = lNum % 2019;
		int rdim = rNum % 2019;
		s.close();
		int min = 2019;
		if (lNum / 2019 == rNum / 2019) {
			for (int i = ldim; i < rdim; i++) {
				for (int j = i + 1; j <= rdim; j++) {
					int amari = (i * j) % 2019;
					if (amari < min) {
						min = amari;
					}
					if(amari == 0) {
						min = 0;
						break;
					}
				}
			}
		}else {
			min = 0;
		}
		System.out.println(min);

	}

}
