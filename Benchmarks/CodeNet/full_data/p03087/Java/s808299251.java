
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		AC2 ac = new AC2(s);
		
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int ans = ac.getAC(l, r);
			System.out.println(ans);
		}
		
	}
	
}

class AC2 {
	String s;
	ArrayList<Integer> acList = new ArrayList<>();
	AC2(String s) {
		this.s = s;
		boolean a = false;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (a) {
				if (ch == 'C') {
					acList.add(i);
					a = false;
					continue;
				}
			}
			a = (ch == 'A') ? true : false;
		}
	}
	int getAC(int l, int r) {
		int ac = 0;
		for (int acIndex : acList) {
			if (acIndex > r - 1) {
				break;
			}
			if (acIndex >= l) {
				ac++;
			}
		}
		return ac;
	}
}
