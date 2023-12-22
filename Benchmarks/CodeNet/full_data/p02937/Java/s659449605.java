import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int loop = 0;
		int hantei;
		int kari = 0;
		char[] c1 = scan.next().toCharArray();
		char[] c2 = scan.next().toCharArray();
		scan.close();
		for (int i = 0; i < c2.length;) {
			hantei = 0;
			for (int j = 0; j < c1.length; j++) {
				if (c2[i] == c1[j]) {
					kari = (loop * c1.length) + j;
					i++;
					hantei = 1;
					if (i == c2.length) {
						break;
					}
				}
			}
			if (hantei == 1) {
				loop++;
			} else {
				kari = -2;
				break;
			}
		}
		System.out.print(kari + 1);
	}

}
