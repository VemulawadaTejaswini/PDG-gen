import java.util.*;
public class Main {
		
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		sc.close();
		
		int ones[] = new int[N];
		int zeros[] = new int[N];
		Arrays.fill(ones,-1); Arrays.fill(zeros,-1);
		
		char before = '1';
		boolean zeroStart = false;
		if(S.charAt(0)=='0') {
			before = '0';
			zeroStart = true;
		}
		
		char Slast = S.charAt(N-1);
		
		int oneP = 0 , zeroP = 0;
		
		int cnt = 0;
		for(int i=0;i<N;i++) {
			char s = S.charAt(i);
			if(s == before) {				
				cnt ++;
			}else {
				if(s=='0') {
					ones[oneP] = cnt;
					oneP++;
					cnt = 1;
					before = '0';
				}else {
					zeros[zeroP]=cnt;
					zeroP++;
					cnt = 1;
					before = '1';
				}
			}
		}
		if(S.charAt(N-1)=='0') {
			zeros[zeroP] = cnt;
		}else {
			ones[oneP] = cnt;
		}
	
		
		if(ones[0]==-1) {
			System.out.println(zeros[0]);
			return;
		}
		
		int ans = 0;
		boolean fin = false;
		if(!zeroStart) {
			for(int i=0;i<N;i++) {
				int tmp = ones[i];
				int last = Math.min(K,N-1);
				for(int j = 0;j<last;j++) {
						if(ones[i+j+1]<0||zeros[i+j]<0) {
							if(Slast=='0') {
								tmp += zeros[i+j];
							}
							fin = true;
							break;
						}
						tmp += ones[i+j+1]+zeros[i+j];
				}
				ans = Math.max(ans,tmp);
				if(fin)break;
			}
		}
		else {
			for(int i=0;i<N;i++) {
				int tmp = ones[i];
				int last = Math.min(K,N-1);
				for(int j = 0;j<last;j++) {
					if(ones[i+j+1]<0||zeros[i+j+1]<0) {
						if(Slast=='0') {
							tmp += zeros[i+j+1];
						}
						fin = true;
						break;
					}
					tmp += ones[i+j+1]+zeros[i+j+1]; 
				}
				ans = Math.max(ans,tmp);
				if(fin)break;
			}
			int t = 0;
			for(int i=0;i<K;i++) {
				if(ones[i]<0||zeros[i]<0) break;
				t += zeros[i]+ones[i];
			}
			ans = Math.max(ans,t);
		}
		
		System.out.println(ans);
	}

	
}