import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			String word = scan.next();
			set.add(word);
		}
		
		if(set.size() != num) {
			System.out.println("No");
			return;
		}
		
		String pword = "";
		for(String word : set) {
			if("".equals(pword)) {
				pword = word;
				continue;
			}
			
			if(!pword.endsWith(word.substring(0, 1))) {
				System.out.println("No");
				return;
			}
			pword = word;
		}
		System.out.println("Yes");
	}
}
