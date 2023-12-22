import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] chars = s.toCharArray();
		String ans = "Good";
		for(int i = 0; i < 2; i++){
			if(chars[i] == chars[i+1]){
				ans = "Bad";
				break;
			}
		}
		System.out.println(ans);
	}
}
