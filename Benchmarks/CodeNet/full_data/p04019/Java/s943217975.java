import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int count [] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)-'A']++;
		}

		if(count['N'-'A'] > 0 && count['S'-'A'] == 0){
			System.out.println("NO");
		}else if(count['N'-'A'] == 0 && count['S'-'A'] > 0){
			System.out.println("NO");
		}else if(count['W'-'A'] > 0 && count['E'-'A'] == 0){
			System.out.println("NO");
		}else if(count['W'-'A'] == 0 && count['E'-'A'] > 0){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
	}
}