import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		int[] p=new int[44];
		int max=0;
		long sum=0;
		long c=1;
		for(long i = 0; i<n; i++){
			long a = sc.nextLong();
			sum+=a;
			int count=0;
			while(a>0){
				if((a & 1)==1){
					p[count]++;
				}
				a>>=1;
				count++;
			}
			if(max<count){
				max=count;
			}
		}
		long ksum=0;
		long l=k;
		long c1=c/2;
		for(int i = max-1; i>=0; i--){
			if(n-2*p[i]>0){
				if(l-c1>=0){
					ksum+=c1*(n-2*p[i]);
					l-=c1;
				}
			}
			c1/=2;
		}
		sum+=ksum;
		k>>=max;
		while(k>0){
				if((k & 1)==1){
					sum+=n*c;
				}
				k>>=1;
				c*=2;
			}
		System.out.println(sum);
	}
}
