import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		float maxexp = 0;
		int p[] = new int[N];
		float exp[] = new float[N];
		float kexp[] = new float[N-K+1];
		
		for(int i=0;i<N;i++) {
			p[i] = sc.nextInt();
			exp[i] = ((float)1+p[i])/(float)2;
		}
		kexp[0]=0;
		for(int i=0;i<K;++i) {
			kexp[0]=kexp[0]+exp[i];
		}
			
		for(int j=1;j<N-K+1;j++) {
			kexp[j] = kexp[j-1]-exp[j-1]+exp[j+K-1];
		}
		
		for(int i=0;i<N-K+1;++i) {
			if(kexp[i]>maxexp) {
				maxexp=kexp[i];
			}
		}
		
		
//		for(int i=0;i<N-K+1;i++) {
//			float checkexp =0;
//			
//			for(int j=0;j<K;j++) {
//				checkexp+=exp[i+j];
//			}
//			
//			if(checkexp > maxexp) {
//				maxexp=checkexp;
//			}		
//		}
		
		System.out.println(maxexp);
	}	
}