import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String SI = sc.next();
		String T = sc.next();
		for (int i=SI.length()-T.length();i>=0;i--) {
			if (Main.compare(SI.substring(i,i+T.length()), T)==true) {
				StringBuffer sb = new StringBuffer();
				for (int j=0;j<i;j++) {
					if (SI.charAt(j)=='?') {
						sb.append('a');
					} else {
						sb.append(SI.charAt(j));
					}
				}
				sb.append(T);
				for (int j=i+T.length();j<SI.length();j++) {
					if (SI.charAt(j)=='?') {
						sb.append('a');
					} else {
						sb.append(SI.charAt(j));
					}
				}
				System.out.println(sb.toString());
				return ;
			}
		}
		System.out.println("UNRESTORABLE");
	}

	public static boolean compare (String S,String T) {
		for (int i=0;i<S.length();i++) {
			if (S.charAt(i)!='?'&&S.charAt(i)!=T.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}