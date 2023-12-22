import java.util.*;
public class Main {
	private static final boolean debug = false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();

		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}

		int count = 0;
		for(int x=1;x<=m;x++) {
			boolean chk = true;
			for(int k=0;k<n;k++) {
				if(debug) {System.out.println("x: " + x);}
				if(debug) {System.out.println("k: " + k);}
				if(debug) {System.out.println("a[k]: " + a[k]);}
				int pchild = 2*x - a[k];
				int pparent = 2*a[k];
				if(debug) {System.out.println("pchild: " + pchild);}
				if(debug) {System.out.println("pparent: " + pchild);}
				if(debug) {System.out.println("pchild%pparent: " + (pchild % pparent));}
				if(pchild % pparent != 0) {
					chk = false;
					break;
				}
			}
			if(chk) {
				count++;
				if(debug) {System.out.println("count++");}
			}
		}
		System.out.println(count);
	}
}
