import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i <= 2; i++){
			String s = sc.next();
			sb.append(s.substring(0, 1).toUpperCase());
		}
		System.out.println(sb.toString());
	}

}
