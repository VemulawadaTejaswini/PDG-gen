import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l[] = new int[n];
		int ans = 0;
		for(int i = 0;i < n;i++) {
			l[i] = sc.nextInt();
		}
		for(int i = 0;i < n-2;i++) {
			for(int k = i+1;k < n-1;k++) {
				for(int m = k+1;m < n;m++) {
					if(l[i] < l[k]+l[m] && l[k] < l[i] + l[m] && l[m] < l[i] + l[k]) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);

	}

}
