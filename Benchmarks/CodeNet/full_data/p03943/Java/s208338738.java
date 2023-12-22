import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		
		if(((a+b+c)/2 == a) || ((a+b+c)/2 == b) || ((a+b+c)/2 == c)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
