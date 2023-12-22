import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String T = sc.next();
		sc.close();
		int l1 = s.length();
		int l2 = T.length();
		if(l2 > l1) {
			System.out.println("UNRESTORABLE");
			System.exit(0);
		}
		StringBuilder sb1 = new StringBuilder(s);
		StringBuilder sb2 = new StringBuilder(T);
		sb1 = sb1.reverse();
		sb2 = sb2.reverse();
//		System.out.println(sb1.toString());
//		System.out.println(sb2.toString());
		for(int i = 0; i < l1 - l2; i++) {
			boolean flag = true;
			for(int j = 0; j < l2; j++) {
				char c1 = sb1.charAt(i + j);
				char c2 = sb2.charAt(j);
				if(c1 != '?' && c1 != c2) {
					flag = false;
					break;
				}
			}
			if(flag) {
				for(int j = 0; j < l2; j++) {
					char c1 = sb1.charAt(i + j);
					char c2 = sb2.charAt(j);
					if(c1 == '?') {
						sb1.replace(i + j, i + j + 1, String.valueOf(c2));
					}
				}
				for(int j = i + l2; j < l1; j++) {
					if(sb1.charAt(j) == '?') {
						sb1.replace(j, j + 1, "a");
					}
				}
			}
		}
		if(sb1.reverse().toString().equals(s)) {
			System.out.println("UNRESTORABLE");
		}else {
			System.out.println(sb1);
		}
	}
}