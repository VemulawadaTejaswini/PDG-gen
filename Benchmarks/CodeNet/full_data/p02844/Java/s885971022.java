import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count =0;
		String s = sc.next();
		for (int i=0;i<1000;i++) {
			String temp = String.valueOf(i);
			StringBuffer sb = new StringBuffer();
			for (int j =temp.length();j<3;j++) {
				sb.append(0);
			}
			sb.append(temp);
			temp = sb.toString();
			int j =0;
			for (;j<s.length();j++) {
				if (temp.charAt(0)==s.charAt(j)) {
					j++;
					break;
				}
			}
			if (j==s.length()) {
				continue;
			}
			for (;j<s.length();j++) {
				if (temp.charAt(1)==s.charAt(j)) {
					j++;
					break;
				}
			}
			if (j==s.length()) {
				continue;
			}
			for (;j<s.length();j++) {
				if (temp.charAt(2)==s.charAt(j)) {
					break;
				}
			}
			if (j==s.length()) {
				continue;
			}
			count ++;
		}
		System.out.println(count);
	}
}