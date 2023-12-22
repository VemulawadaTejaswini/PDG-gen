import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		final String one = "1";
		int ans = 0;

		String s = scan().next();

		for(int i = 0; i < s.length(); i++){
			String a = String.valueOf(s.charAt(i));
			if(one.equals(a)){
				ans++;
			}
		}

		System.out.println(ans);
	}

	private static Scanner scan() {
		return new Scanner(System.in);
	}

}
