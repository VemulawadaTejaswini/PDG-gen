import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String moji = sc.next();
			String answer = "No";
			if (moji.charAt(2) == (moji.charAt(3))) {
				if (moji.charAt(4) == (moji.charAt(5))) {
					answer = "Yes";
				}

			}
			System.out.println(answer);

		} finally

		{
			sc.close();
		}
	}

}
