import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int cnt = 0;
		for(int i = 0; i < 3; i++) {
			if(str.substring(i, i + 1).equals("1")) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
