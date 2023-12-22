import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long h[] = new long[N];
		for(int i=0; i<N; i++){
			h[i]=sc.nextLong();
			
		}
		Arrays.sort(h);
		long times=0;
		long maximum = h[N-1];
		long T=1;
		T=h[N-1]/A;
		if(T>100000000){
			T=10000000;
			A=A*T;
			B=B*T;
		}
		else if(T>10000000){
			T=1000000;
			A=A*T;
			B=B*T;
		}
		else if(T>1000000){
			T=100000;
			A=A*T;
			B=B*T;
		}
		else if(T>100000){
			T=10000;
			A=A*T;
			B=B*T;
		}
		else if(T>10000){
			T=1000;
			A=A*T;
			B=B*T;
		}
		else if(T>1000){
			T=100;
			A=A*T;
			B=B*T;
		}
		else T=1;
		
		int flag=0;
		
		while(h[N-1]>0){
			h[N-1]-=A;
			times=times+T;
			if(h[N-1]<0&&T>5){
				h[N-1]+=A;
				flag=1;
				A=A/T;
				B=B/T;
				times=times-T;
				T=h[N-1]/A;
				if(T>100000000){
					T=10000000;
					A=A*T;
					B=B*T;
				}
				else if(T>10000000){
					T=1000000;
					A=A*T;
					B=B*T;
				}
				else if(T>1000000){
					T=100000;
					A=A*T;
					B=B*T;
				}
				else if(T>100000){
					T=10000;
					A=A*T;
					B=B*T;
				}
				else if(T>10000){
					T=1000;
					A=A*T;
					B=B*T;
				}
				else if(T>1000){
					T=100;
					A=A*T;
					B=B*T;
				}
				else{
					T=1;
				}
			}
			if(flag==0){
			maximum = h[N-1];
			for(int i=0; i<N-1; i++){
				h[i]-=B;
				if(h[i]>maximum){
					maximum=h[i];
					long tmp=h[N-1];
					h[N-1]=h[i];
					h[i]=tmp;
				}
				}
			}
			flag=0;
		}
		System.out.println(times);
	}
}