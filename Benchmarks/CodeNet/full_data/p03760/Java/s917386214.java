import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String O = sc.next();
		String E = sc.next();
		sc.close();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < Integer.min(O.length(), E.length());++i) {
			sb.append(O.charAt(i));
			sb.append(E.charAt(i));
		}
		if(O.length() < E.length())
			sb.append(E.charAt(E.length()-1));
		else
			sb.append(O.charAt(O.length()-1));
		System.out.println(sb.toString());
	}
}
