import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		StringBuilder sb = new StringBuilder(S);
		int cnt1 = 0;
		int cnt2 = 0;
		for(int i = 0; i < sb.length(); i++) {
			if(sb.substring(i, i + 1).equals("(")) {
				in : for(int j = i; j < sb.length(); j++) {
					if(sb.substring(j, j + 1).equals(")")) {
						sb.delete(j, j + 1);
						sb.delete(i, i + 1);
						break in;
					}
				}
			}
		}
		
		for(int i = 0; i < sb.length(); i++) {
			if(sb.substring(sb.length() - i - 1, sb.length() - i).equals(")")) {
				in : for(int j = i; j < sb.length(); j++) {
					if(S.substring(sb.length() - j - 1, sb.length() - j).equals("(")) {
						sb.delete(sb.length() - i - 1, sb.length() - i);
						sb.delete(sb.length() - j - 1, sb.length() - j);
						break in;
					}
				}
			}
		}
		
		for(int i = 0; i < sb.length(); i++) {
			if(sb.substring(i, i + 1).equals("(")) {
				cnt1++;
			} else {
				cnt2++;
			}
		}
		
		for(int i = 0; i < cnt2; i ++) {
			System.out.print("(");
		}
		System.out.print(S);
		for(int i = 0; i < cnt1; i++) {
			System.out.print(")");
		}
	}
}
