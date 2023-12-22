import java.util.*;

//081C
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int A[] = new int[N];
		for(int i=0;i<N;i++)A[i]=sc.nextInt()-1;//A ：0~N-1
		sc.close();
		
		Set<Integer> s = new HashSet<Integer>();
		
		int cnt[] = new int[N]; //各数字の登場回数
		
		for(int i=0;i<N;i++) {
			cnt[A[i]]++;
			s.add(A[i]);
		}
		
		int num[] = new int[N+1];
		for(int i=0;i<N;i++) {
			num[cnt[i]]++; //配列の要素番号が、登場回数、要素が使える回数。
		}
		
		int change = Math.max(0, s.size() - K) ;
		
		int last = 0;
		for(int i=N-1;i>=0;i--) {
			if(num[i]!=0)last=i;
		}
		
		int ans = 0;
		int i=0;
		while(ans<change) {
			if(num[i]==0)i++;
			ans += i;
			num[i]--;
			num[last]--;
			last+=i;
			num[last]++;
		}
		
		System.out.println(ans);
		
	}
}
