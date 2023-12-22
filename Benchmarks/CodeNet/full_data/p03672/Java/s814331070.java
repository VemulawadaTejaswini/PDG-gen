import java.util.Scanner;

public class Main{
	static boolean isEvenStr(String str) {
		return str.substring(0, str.length() / 2).equals(str.substring(str.length() / 2));
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int ans = 0;
		for(int i = str.length() - 1; i >= 0; i--) {
			if(isEvenStr(str.substring(0, i))) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}
