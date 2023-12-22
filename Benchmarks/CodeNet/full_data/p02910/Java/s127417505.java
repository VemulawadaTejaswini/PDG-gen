import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		
		for (int i=0; i<a.length; i++) {
			int t = i%2+a[i];
			if (t=='S' || t=='L') {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
