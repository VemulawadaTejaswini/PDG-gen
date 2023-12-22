import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		String s = in.next();

		boolean isOdd = false;
		for(int i=0; i < s.length(); i++) {
			isOdd = !isOdd;
			char c = s.charAt(i);
			if( c == 'U' || c == 'D') continue;
			if( isOdd && c == 'L') {
				System.out.println("No");
				return;
			}else if(!isOdd && c == 'R') {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
	}

}