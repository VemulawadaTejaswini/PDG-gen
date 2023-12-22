import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int ans = 0;
		for(int i = 1 ; i < n ; i++) {
			String x = s.substring(0, i);
			String y = s.substring(i);
			int nn = 0;
			Set<Character> set1 = new HashSet<>();
			Set<Character> set2 = new HashSet<>();
			for(int j = 0 ; j < x.length(); j++) {
				set1.add(x.charAt(j));
			}
			for(int j = 0 ; j < y.length() ; j++) {
				set2.add(y.charAt(j));
			}
			for(char key : set1) {
				for(char key1 : set2) {
					if(key == key1) {
						nn++;
						break;
					}
				}
			}
			ans = Math.max(ans, nn);
		}
		System.out.println(ans);
	}
}
