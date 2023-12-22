import java.util.*;
interface Main{
	static void main(String[]$){
		Scanner s=new Scanner(System.in);
		final int D=1000000007,N=s.nextInt(),M=s.next().length();
		s.close();
		long[]p=new long[N+1],a=new long[N+1];
		p[M]=1;
		for(int i=N;i>=1;i--){
			a[0]=(p[0]+p[1])%D;
			for(int j=1;j<i;j++)a[j]=(p[j-1]*2+p[j+1])%D;
			System.arraycopy(a,0,p,0,i);
		}
		System.out.println(a[0]);
	}
}