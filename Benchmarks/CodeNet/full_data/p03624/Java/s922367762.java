import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		if (S.chars().distinct().count() == 26) {
			System.out.println("None");
			return;
		}
		
		char min = 'a';
		for (char c : S.toCharArray()) {
			if (min == c) {
				min = (char)(min + 1);
			}
		}
		System.out.println(min);
	}
}