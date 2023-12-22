import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		long a = in.nextLong();
		int b = 0;
		for(int i = 0;i < s.length();i ++) {
			if(s.charAt(i) == '1')b ++;
			else break;
		}
		if(b >= a)System.out.println(1);
		else System.out.println(s.charAt(b));
	}
}
