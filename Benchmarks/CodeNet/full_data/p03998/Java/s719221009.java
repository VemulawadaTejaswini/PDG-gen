import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		String[] a = {sc.next(),sc.next(),sc.next()};
		char ch = a[0].charAt(0); a[0]=a[0].substring(1);
		while (!a[0].isEmpty()&&!a[1].isEmpty()||!a[2].isEmpty()) {
			switch(ch) {
				case 'a': ch=a[0].charAt(0); a[0]=a[0].substring(1); break;
				case 'b': ch=a[1].charAt(0); a[1]=a[1].substring(1); break;
				case 'c': ch=a[2].charAt(0); a[2]=a[2].substring(1); break;
			}
		}
		System.out.println((ch=='a') ? 'A' : (ch=='b') ? 'B' : 'C');
		sc.close();
	}

	public static void main(String args[]) {
		solve();
	}

}
