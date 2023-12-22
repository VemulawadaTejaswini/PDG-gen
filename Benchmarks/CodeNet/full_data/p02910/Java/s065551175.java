import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(check(str)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	
	public static boolean check(String str) {
		int Count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(i%2 == 0) {
				if((str.charAt(i) == 'R') || (str.charAt(i) == 'U')||(str.charAt(i) == 'D')) {
					Count++;
				}
			}else {
				if((str.charAt(i) == 'L') || (str.charAt(i) == 'U')||(str.charAt(i) == 'D')) {
					Count++;
				}
			}
		}
		if(Count == str.length()) {
			return true;
		}else {
			return false;
		}
		
	}
}