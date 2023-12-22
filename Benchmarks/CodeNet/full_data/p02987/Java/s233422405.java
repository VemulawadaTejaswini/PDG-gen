import java.util.Scanner;

public class Main {
	static char[] chars;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		chars = s.toCharArray();
		boolean bool = true;
		for(char c : chars){
			if( ! check(c)){
				bool = false;
			}
		}
		System.out.println(bool ? "Yes" : "No");
	}
	static boolean check(char c){
		int count = 0;
		for(char c1 : chars){
			if(c ==c1) {
				count++;
			}
		}
		return count == 2;
	}
}
