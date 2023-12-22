import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static String s = null;
	static List<Character> list = new ArrayList<Character>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		s = sc.next();

		Collections.addAll(list, 'A','C','T','G');
		
		int max = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(list.contains(s.charAt(i))) {
				int j = check(i+1)-i;
				max = Math.max(j, max);
			}
		}

		System.out.println(max);
	}
	
	public static int check(int i) {
		if(i >= s.length() || !list.contains(s.charAt(i))) {
			return i;
		}else{
			return check(i+1);
		}
	}
}