import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int A = scanner.nextInt();
		int a = 0;
		int b = 0;
		int B = scanner.nextInt();
		
		String string = scanner.next();
		
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (c == 'c') {
				System.out.println("No");
				continue;
			}
			
			if (c == 'a' ) {
				if ((a + b) < (A + B)) {
					System.out.println("Yes");
					a++;
				} else {
					System.out.println("No");
				}
			}
			
			if (c == 'b') {
				if ((a + b) < (A + B) && b < B) {
					b++;
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
			
		}
	}

}