import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long L=sc.nextLong();
		long A=sc.nextLong();
		long B=sc.nextLong();
		int M=sc.nextInt();
		sc.close();
		long C;
		long D=0;
		for(long i=0;i<L;i++) {
			C=A+B*i;
			for(long j=i+1;j<L;j++) {
				C*=Math.pow(10, (int)Math.log10(A+B*j)+1);
				if(C>=M) {
					C%=M;
				}
			}
			D+=C;
			if(D>=M) {
				D%=M;
			}
		}
		System.out.println(D);
	}
}