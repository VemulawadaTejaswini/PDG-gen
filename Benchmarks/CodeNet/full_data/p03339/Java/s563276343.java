import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int l = 0, r = n - 1;
		for(int i = 0 ; i < n - 1 ; i++) {
			if(s.charAt(i + 1) == 'E') l++;
			else break;
		}
		for(int i = n - 1 ; i >= 1 ; i--) {
			if(s.charAt(i - 1) == 'W') r--;
			else break;
		}
		int dis = 0;
		for(int i = l ; i >= 1 ; i--) {
			if(s.charAt(i - 1) == 'W') dis++;
		}
		for(int i = l ; i < n - 1 ; i++)  {
			if(s.charAt(i + 1) == 'E') dis++;
		}
		int dis1 = 0;
		for(int i = r ; i >= 1 ; i--) {
			if(s.charAt(i - 1) == 'W') dis1++;
		}
		for(int i = r ; i < n - 1 ; i++)  {
			if(s.charAt(i + 1) == 'E') dis1++;
		}
//		System.out.println(l + " " + r);
		System.out.println(Math.min(dis, dis1));
	}
}
