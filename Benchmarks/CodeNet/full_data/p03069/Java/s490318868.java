import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();
		sc = null;
		int sum=0;
		int i;
		for(i=0;i<n;i++) {
			if(s.charAt(i) == '.') {
				sum++;
			}
		}
		System.out.println(Math.min(sum,n-sum));
	}
}