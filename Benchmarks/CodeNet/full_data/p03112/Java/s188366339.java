import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int Q = sc.nextInt();
		long s[] = new long[A];
		long t[] = new long[B];
		long x[] = new long[Q];
		for(int i=0;i<A;i++) {
			s[i]=sc.nextLong();
		}
		for(int i=0;i<B;i++) {
			t[i]=sc.nextLong();
		}
		for(int i=0;i<Q;i++) {
			x[i]=sc.nextLong();
		}
		sc.close();
		
		//sort
		Arrays.sort(s);
		Arrays.sort(t);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<Q;i++) {
			long X = x[i];
			
			
			//神社から回る場合
			int l = -1;
			int r = A;
			l = bi(l,r,X,s);//二分探索
			r = l + 1;
			
			long ans = 0;
			long Y;
			long tmp = 0;
			
			if(l==-1){
				ans += s[r]-X;
				Y = s[r];
				l = -1;
				r = B;
				l = bi(l,r,Y,t);
				r = l+1;
				if(l==-1){
					ans += t[r]-Y;
				}else if(r==B){
					ans += Y-t[l];
				}else {
					ans += Math.min(t[r]-Y, Y-t[l]);
				}
			}else if(r==A){
				ans += X - s[l];
				Y = s[l]; 
				l = -1;
				r = B;
				l = bi(l,r,Y,t);
				r = l+1;
				if(l==-1){
					ans += t[r]-Y;
				}else if(r==B){
					ans += Y-t[l];
				}else {
					ans += Math.min(t[r]-Y, Y-t[l]);
				}
			}else {

				//s[r]にいく。
				Y = s[r]; 
				long ansr = s[r]-X;
				l = -1;
				r = B;
				l = bi(l,r,Y,t);
				r = l+1;
				if(l==-1){
					ansr += t[r]-Y;
				}else if(r==B){
					ansr += Y-t[l];
				}else {
					ansr += Math.min(t[r]-Y, Y-t[l]);
				}
				//s[l]にいく。
				Y = s[l];
				long ansl = X-s[l];
				l = -1;
				r = B;
				l = bi(l,r,Y,t);
				r = l+1;
				if(l==-1){
					ansl += t[r]-Y;
				}else if(r==B){
					ansl += Y-t[l];
				}else {
					ansl += Math.min(t[r]-Y, Y-t[l]);
				}
				
				ans = Math.min(ansr, ansl);
			}
			tmp = ans;
			
			ans = 0;
			
			//寺から回る場合
			l = -1;
			r = B;
			l = bi(l,r,X,t);//二分探索
			r = l + 1;
			
			if(l==-1){
				ans += t[r]-X;
				Y = t[r];
				l = -1;
				r = A;
				l = bi(l,r,Y,s);
				r = l+1;
				if(l==-1){
					ans += s[r]-Y;
				}else if(r==A){
					ans += Y-s[l];
				}else {
					ans += Math.min(s[r]-Y, Y-s[l]);
				}
			}else if(r==B){
				ans += X - t[l];
				Y = t[l]; 
				l = -1;
				r = A;
				l = bi(l,r,Y,s);
				r = l+1;
				if(l==-1){
					ans += s[r]-Y;
				}else if(r==A){
					ans += Y-s[l];
				}else {
					ans += Math.min(s[r]-Y, Y-s[l]);
				}
			}else {
				//s[r]にいく。
				Y = t[r]; 
				long ansr = t[r]-X;
				l = -1;
				r = A;
				l = bi(l,r,Y,s);
				r = l+1;
				if(l==-1){
					ansr += s[r]-Y;
				}else if(r==A){
					ansr += Y-s[l];
				}else {
					ansr += Math.min(s[r]-Y, Y-s[l]);
				}
				//s[l]にいく。
				Y = t[l];
				long ansl = X-t[l];
				l = -1;
				r = A;
				l = bi(l,r,Y,s);
				r = l+1;
				if(l==-1){
					ansl += s[r]-Y;
				}else if(r==A){
					ansl += Y-s[l];
				}else {
					ansl += Math.min(s[r]-Y, Y-s[l]);
				}
				
				ans = Math.min(ansr, ansl);
			}
			ans = Math.min(ans,tmp);
			
			//出力
			
			sb.append(ans + "\n");
		}
		System.out.println(sb.toString());
	}
	
	//lを返すので、rはl+1で求める。
	static int bi(int l, int r, long X, long s[]) {
		while(r>l+1) {
			int c = (l+r)/2;
			if(X > s[c]) l=c;
			else r=c;
		}
		return l;
	}
	
}
