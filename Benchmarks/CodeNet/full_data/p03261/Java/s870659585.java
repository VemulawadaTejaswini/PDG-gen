import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		char last = 'X';
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (list.contains(s)) {
				flag = false;
				break;
			} else {
				list.add(s);
			}
			if (i != 0 && s.charAt(0) != last) {
				flag = false;
				break;
			}
			last = s.charAt(s.length() - 1);
		}
		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
}