import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String s1 = S.substring(0, 1);
		String s2 = "";
		boolean f1 = false;
		boolean f2 = false;
		boolean f = false;
		for(int i = 1; i < 4; i++) {
			if(S.substring(i, i + 1).equals(s1)) {
				if(f1) {
					System.out.println("No");
					return;
				} else {
					f1 = true;
				}
			} else {
				if(f) {
					if(S.substring(i, i + 1).equals(s2)) {
						if(f2) {
							System.out.println("No");
							return;
						} else {
							f2 = true;
						}
					} else {
						System.out.println("No");
						return;
					}
				} else {
					s2 = S.substring(i, i + 1);
					f = true;
				}
			}
		}
		System.out.println("Yes");
	}
}
