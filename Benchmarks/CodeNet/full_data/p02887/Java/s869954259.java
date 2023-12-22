import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String s = sc.next();
		
		char[] c = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<c.length-1;i++) {		
			if(c[i] == c[i+1]) {
				continue;
			}
			sb.append(c[i]);
		}
		sb.append(c[c.length-1]);
		
		System.out.println(sb.toString());
		System.out.println(sb.toString().length());
		
		sc.close();
	}
}