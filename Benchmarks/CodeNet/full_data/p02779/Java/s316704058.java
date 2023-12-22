import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner kbs = new Scanner(System.in);
		int n = kbs.nextInt();
		int a[] = new int[n];
		String s = "";
		for(int i = 0; i < n; i++) {
			a[i] = kbs.nextInt();
			if(a[i] != a[i]) {
				s = "NO";
			}
			else {
				s = "YES";
			}
		}
		System.out.printf("%s", s);
		kbs.close();
	}

}
