import java.util.*;
interface Main{
	static void main(String[]$){
		Scanner s=new Scanner(System.in);
		final int D=1000000007,N=s.nextInt(),M=s.next().length();
		s.close();
		long[]p=new long[M+N+2],a=new long[M+N+2];
		p[M]=1;
		for(int i=1;i<=N;i++){
			a[0]=(p[0]+p[1])%D;
			for (int j=1;j<=M+i;j++)a[j]=(p[j-1]*2+p[j+1])%D;
			System.arraycopy(a,0,p,0,M+N+2);
		}
		System.out.println(a[0]);
	}
}