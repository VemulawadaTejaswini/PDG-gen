import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		TreeSet<String> sub = new TreeSet<String>();
		
		for(int i = 1; i <= 5; i++) {
			for(int n = 0; n < s.length(); n++) {
				if((n + i) >= s.length()) {
					sub.add(s.substring(n, s.length()));
				}else {
					sub.add(s.substring(n, (n + i)));
				}
			}
		}
		
		int k = sc.nextInt();
		int count = 0;
		for(String st: sub) {
			count++;
			if(count == k) {
				System.out.println(st);
				break;
			}
		}
		
	}
}