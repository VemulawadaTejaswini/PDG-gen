import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			AC ac = new AC(s.substring(l - 1, r));
			int ans = ac.getAC();
			System.out.println(ans);
		}
		
	}
	
}

class AC {
	String s;
	AC(String s) {
		this.s = s;
	}
	int getAC() {
		boolean a = false;
		int ac = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (a) {
				if (ch == 'C') {
					ac++;
					a = false;
					continue;
				}
			}
			a = (ch == 'A') ? true : false;
		}
		return ac;
	}
}
