import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private static int count;
	public static char used;
	public static String comment = "";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String words = sc.next();

		char[] c = words.toCharArray();

		List<Character> list = new ArrayList<>();

		for (int i = 0; i < c.length; i++) {
			list.add(c[i]);
		}
		used = c[0];

		list.stream()
			.sorted((a,b) -> b - a)
			.forEach(i -> comment(count(i)));
		
		System.out.println(comment);
	}
	
	public static boolean count(char c) {
		
		if(used == c) {
			count++;
		} else if(count % 2 == 1) {
			return false;
		} else {
			count = 1;
		}
		return true;
	}
	
	public static void comment(boolean b) {
		
		if(comment.equals("No")) {return;}
		
		if(b) {
			comment = "Yes";
		} else {
			comment = "No";
		}
	}

}