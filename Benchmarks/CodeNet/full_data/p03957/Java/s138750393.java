import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='C'||s.charAt(i)=='F') {
				sb.append(s.charAt(i));
			}
		}
		String re=sb.toString();
		if (re.contains("CF")) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}
}