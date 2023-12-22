import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String a = input.substring(0, input.length()/2);
		String rev = reverse(input);
		String b = rev.substring(0, input.length()/2);
		int cnt = 0;
		for (int i = 0; i<input.length()/2; i++) {
			if(a.charAt(i) != b.charAt(i)) cnt++;
		}
		System.out.println(cnt);
	}
	
	private static String reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}

}
