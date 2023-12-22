import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i]= sc.nextInt();
		}
		
		int l = 0, r= 0, mask = 0;
		long ans = 0;
		while(l < n){
			if(r<n && (a[r] & mask) == 0){
				mask |= a[r++];
			}
			else{
				ans += r-l;
				mask ^= a[l++];
			}
		}
		System.out.println(ans);
	}

}
