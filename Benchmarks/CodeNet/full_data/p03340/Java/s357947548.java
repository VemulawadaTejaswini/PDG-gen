import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N]; 
		for(int i=0;i<N;i++)A[i]=sc.nextInt();
		sc.close();
		
		long ans = 0;
		int cnt[] = new int[20];
		
		int r = 0;
		for(int l=0;l<N;l++) {
			if(l>r) {
				r++;
				int a = A[r];
				for(int i=0;i<20;i++) {
					if((a>>i&1)==1)cnt[i]++;
				}
			}

			
			while(r<N&&check(add(cnt,A[r]))) {
				cnt = add(cnt,A[r]);
				r++;
			}
			ans +=(r-l);
			
 			for(int i=0;i<20;i++) {
				cnt[i]-=(A[l]>>i&1);
			}
		}
		System.out.println(ans);
		
	}
	
	static boolean check(int cnt[]) {
		for(int t:cnt) {
			if(t>=2)return false;
		}
		return true;
	}
	
	static int[] add(int cnt[], int a) {
		int tmp[] = cnt.clone();
		for(int i=0;i<20;i++) {
			if((a>>i&1)==1)tmp[i]++;
		}
		return tmp;
	}
}
