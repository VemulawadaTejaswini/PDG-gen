import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = 100001;
		boolean[] isPrime = new boolean[N];
                isPrime[2] = true;
		for(int i=3;i<N;i+=2) isPrime[i] = true;
		for(int i=3;i<=(int)Math.sqrt((double)N);++i){
			if(isPrime[i]){
				for(int j=i*i;j<N;j+=2*i) isPrime[j] = false;
			}
		}		
		int[] ruiseki = new int[N];
		ruiseki[1] = 0;
		for(int i=3;i<N;i+=2){
			if(isPrime[i]&&isPrime[(i+1)/2]) ruiseki[i]++;
			ruiseki[i] += ruiseki[i-2];
		}
		
		int Q = sc.nextInt();
		for(int i=0;i<Q;++i){
			int l = sc.nextInt()-2;
			if(l<0) l=1;
			int r = sc.nextInt();
			System.out.println(ruiseki[r]-ruiseki[l]);
		}
		return;
	}
}