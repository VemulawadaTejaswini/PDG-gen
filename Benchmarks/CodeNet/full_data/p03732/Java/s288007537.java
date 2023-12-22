import java.util.*;
public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), W = sc.nextInt();
		int item[][] = new int[N][2];
		for(int i=0;i<N;i++) {
			item[i][0]= sc.nextInt(); //w
			item[i][1]= sc.nextInt(); //v
		}
		sc.close();
		
		int w0 = item[0][0];
		
		Integer weight0[]= new Integer[100];
		Integer weight1[]= new Integer[100];
		Integer weight2[]= new Integer[100];
		Integer weight3[]= new Integer[100];
		Arrays.fill(weight0, 0);
		Arrays.fill(weight1, 0);
		Arrays.fill(weight2, 0);
		Arrays.fill(weight3, 0);
		
		int pointer[] = new int[4];
		for(int i=0;i<N;i++) {
			int weight = item[i][0] - w0;
			int value = item[i][1];
			
			if(weight==0) {
				weight0[pointer[weight]]=value;
				pointer[weight]++;
			}
			if(weight==1) {
				weight1[pointer[weight]]=value;
				pointer[weight]++;
			}
			if(weight==2) {
				weight2[pointer[weight]]=value;
				pointer[weight]++;
			}
			if(weight==3) {
				weight3[pointer[weight]]=value;
				pointer[weight]++;
			}
		}
		Arrays.sort(weight0, (w1,w2)->w2-w1);
		Arrays.sort(weight1, (w1,w2)->w2-w1);
		Arrays.sort(weight2, (w1,w2)->w2-w1);
		Arrays.sort(weight3, (w1,w2)->w2-w1);
		
		//累積和を用意しておく
		long cumSum0[] = new long[N+1]; 
		long cumSum1[] = new long[N+1];
		long cumSum2[] = new long[N+1];
		long cumSum3[] = new long[N+1];
		
		
		for(int i=0;i<N;i++) {
			cumSum0[i+1] = cumSum0[i]+weight0[i];
			cumSum1[i+1] = cumSum1[i]+weight1[i];
			cumSum2[i+1] = cumSum2[i]+weight2[i];
			cumSum3[i+1] = cumSum3[i]+weight3[i];
		}
		
		int upper = 0;
		
		//荷物の数
		int minP = Math.min(W/(w0+3),N);
		int maxP = Math.min(W/w0,N);
		long ans = 0;
		for(int p=minP;p<=maxP;p++) {
			upper = W - w0*p;
			for(int i=0;i<=p;i++) {
				for(int j=0;i+j<=p;j++) {
					for(int k=0;i+j+k<=p;k++){	
							int l  = p -(i+j+k);
							//w1をi個, w1+1:j w1+2:k w1+3:l
							if(j+2*k+3*l > upper)continue;
							long sum = cumSum0[i]+cumSum1[j]+cumSum2[k]+cumSum3[l];
							ans = Math.max(ans, sum);
					}
				}
			}
			
			
		}
		System.out.println(ans);
	}
}