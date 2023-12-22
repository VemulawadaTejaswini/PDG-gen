import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		boolean b = true;
		
		//奇数文字がRUDのいずれかかを調べる
		for(int i = 0; i < s.length(); i += 2) {
			if(!(isRUD(s.charAt(i)))) {
				b = false;
				break;
			}
		}
		
		//偶数文字がRUDのいずれかかを調べる
		for(int i = 1; i < s.length(); i+= 2) {
			if(!(isLUD(s.charAt(i)))) {
				b = false;
				break;
			}
		}
		
		if(b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
		
	static boolean isRUD(char c) {
		if(c == 'R') {
			return true;
		} else if(c == 'U') {
			return true;
		} else if(c == 'D') {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean isLUD(char c) {
		if(c == 'L') {
			return true;
		} else if(c == 'U') {
		return true;
		} else if(c == 'D') {
			return true;
		} else {
			return false;
		}
	}
}