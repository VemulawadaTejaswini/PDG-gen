import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String[] a = n.split("", 0);
		int ans = 0;
		int tmp = 0;
		for(int i = 0; i < n.length(); i++) {
			if(a[i].equals("A") || a[i].equals("T")) {
				tmp ++;
				ans = Math.max(tmp, ans);
			}else if(a[i].equals("C") || a[i].equals("G")) {
				tmp ++;
				ans = Math.max(tmp, ans);
			}else {
				tmp = 0;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}

