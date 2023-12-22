import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();

		char[] str = s.toCharArray();



		for(int i=0; i<str.length;i++) {
			int num = str[i] + N;
			char c  = (char)(num);
			if( c > 'Z')
				c = (char)(c - 26);
			System.out.print(c);
		}


		sc.close();

	}

}