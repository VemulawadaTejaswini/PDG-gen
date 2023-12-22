import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int min = 10000;
		for(int i=0;i<S.length()-2;i++) {
			if( min > Math.abs(753 - Integer.parseInt(S.substring(i, i+3))) ) {
				min = Math.abs(753 - Integer.parseInt(S.substring(i, i+3)));
			}
		}
		
		System.out.println(min);
		
		sc.close();
	}
}
