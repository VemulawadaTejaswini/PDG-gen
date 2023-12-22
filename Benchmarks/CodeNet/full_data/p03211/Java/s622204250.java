import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int Slen = S.length();

		int min = 1000;
		int num = 0;
		for(int i=0;i<Slen-2;i++) {
			num = Integer.parseInt(S.substring(i, i+3));
			num = Math.abs(753-num);

			if(num < min) {
				min = num;
			}
		}

		System.out.println(min);

	}

}
