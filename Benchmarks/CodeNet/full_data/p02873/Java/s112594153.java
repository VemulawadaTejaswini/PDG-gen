
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int n = s.length();
		
		int []a = new int [n+1];
		Arrays.fill(a,0);
		List <Integer> l = new ArrayList<Integer>();
		
		for(int i = 0  ; i < n-1 ;i++) {
			if(s.charAt(i) == '>' && s.charAt(i+1) == '<') {
				a[i+1] = 0;
			}
			if(s.charAt(i) == '<' && s.charAt(i+1) == '>') {
				l.add(i+1);
			}
		}
		
		for(int i = 0 ; i < n ;i++) {
			if(s.charAt(i) == '<') {
				a[i+1] = a[i] + 1;
			}
		}
		
		for(int i = n-1 ; i >= 0 ; i--) {
			if(l.contains(i)) {
				a[i] = Math.max(a[i+1] + 1 ,a[i]);
				continue;
			}
			if(s.charAt(i) == '>') {
				a[i] = a[i+1] + 1;
			}
		}
		
		long ans = 0;
		
		for(int i = 0 ; i <= n ;i++) {
			ans += (long)a[i];
		}
		
		System.out.println(ans);
	}
}
