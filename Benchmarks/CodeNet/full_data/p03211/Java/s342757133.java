import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int x = 1000;
		for(int i=0; i<S.length()-2; i++) {
			int a = Character.getNumericValue(S.charAt(i))*100 + Character.getNumericValue(S.charAt(i+1))*10 + Character.getNumericValue(S.charAt(i+2))*1;
			int b = Math.abs(753-a);
			if(b<x) {
				x = b;
			}
		}
		System.out.println(x);
	}

}