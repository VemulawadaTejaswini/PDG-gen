
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		long[] a = new long[n+1];
		for(int i=1;i<n+1;i++) {
			a[i] = a[i-1] + in.nextInt();
		}
		List<Long> list = new ArrayList<>();
		for(int l=0;l<n;l++) {
			for(int r=l+1;r<=n;r++) {
				list.add(a[r]-a[l]);
			}
		}
		List<Long> remain = new ArrayList<>();
		long ans = 0;
		int i = 0;
		for(i=40;i>=0;i--) {
			remain = new ArrayList<>();
			for(long beauty : list) {
				if(((beauty>>i)&1)==1) remain.add(beauty);
			}
			if(remain.size()>=k) {
				ans += 1L<<i;
				list = remain;
			}
		}
		System.out.println(ans);
		in.close();
		
		

	}

}
