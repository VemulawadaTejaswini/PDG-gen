import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0;
		HashMap<Character,Integer>[] st = new HashMap[n];
		for(int i=0;i<n;i++) {
			st[i] = new HashMap<Character,Integer>();
			String s = sc.next();
			for(int k=0;k<s.length();k++) {
				if(st[i].containsKey(s.charAt(k))) {
					st[i].put(s.charAt(k), st[i].get(s.charAt(k)+1));
				}else {
					st[i].put(s.charAt(k), 1);
				}
			}
			
		}
		for(int i=0;i<n;i++) {
			for(int k=i+1;k<n;k++) {
				if(st[i].equals(st[k])) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}