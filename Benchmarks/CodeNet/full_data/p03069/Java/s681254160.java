import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();
		sc = null;
		int sum=0;
		int w=0;
		int i;
		boolean f=false;
		for(i=0;i<n;i++) {
			if(s.charAt(i) == '.') {
				if(f) {
					sum++;
				}else {
					w++;
				}
			} else {
				f = true;
			}
		}
		System.out.println(Math.min(sum,n-sum-w));
	}
}