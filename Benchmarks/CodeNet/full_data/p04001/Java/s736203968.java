import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int N = s.length;
		if(N==1) {
			System.out.println(s[0]);
			sc.close();
			return;
		}
		
		long ans = 0;
		
		boolean[] plus = new boolean[N-1];
		
		while(true) {
			long sum = 0;
			long carry = 0;
			for(int i=0; i<N; i++) {
				carry = carry*10+s[i]-'0';
				if(i==N-1 || plus[i]) {
					sum += carry;
					carry = 0;
				}
			}
			ans += sum;
			boolean car = false;
			for(int i=0; i<N-1; i++) {
				if(plus[i]) {
					car = true;
					plus[i]=false;
				} else {
					car = false;
					plus[i]=true;
					break;
				}
			}
			if(car)
				break;
		}
		
		System.out.println(ans);
		sc.close();
	}
}
