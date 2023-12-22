import java.util.*;
// warm-up
public class Main {
	// Making rookie mistakes.. Not an option
	static void solve() {
		Scanner sc = new Scanner(System.in);
		String[] a = {sc.next(),sc.next(),sc.next()};
		char ch = a[0].charAt(0); a[0]=a[0].substring(1);
		while (ch=='a'||ch=='b'||ch=='c') {
			switch(ch) {
				case 'a': ch=a[0].isEmpty() ? 'A' : a[0].charAt(0); if (ch!='A') a[0]=a[0].substring(1); break;
				case 'b': ch=a[1].isEmpty() ? 'B' : a[1].charAt(0); if (ch!='B') a[1]=a[1].substring(1); break;
				case 'c': ch=a[2].isEmpty() ? 'C' : a[2].charAt(0); if (ch!='C') a[2]=a[2].substring(1); break;
			}
		}
		System.out.println(ch);
		sc.close();
	}

	public static void main(String args[]) {
		solve();
	}

}
