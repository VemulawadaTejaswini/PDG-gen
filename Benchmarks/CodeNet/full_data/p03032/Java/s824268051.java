import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] v = new int[n];
		for(int i=0;i<n;i++) v[i] = in.nextInt();
		int ans = 0;
		for(int i=1;i<=k;i++) {
			for(int l=0;l<=i&&l<=n;l++) {
				List<Integer> list = new ArrayList<>();
				for(int j=0;j<l;j++) list.add(v[j]);
				for(int j=n-i+l;j<n;j++) list.add(v[j]);
				Collections.sort(list);
				int j = 0;
				for(;j<list.size();j++) {
					if(i+j==k || n+j==k || list.get(j)>0) break;
				}
				int tmp = 0;
				for(;j<list.size();j++) {
					tmp += list.get(j);
				}
				if(tmp>ans) ans = tmp;
			}
		}
		System.out.println(ans);
		in.close();
	}

}
