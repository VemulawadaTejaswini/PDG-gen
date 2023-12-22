
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		long ans=0;
		long p[]=new long[A];
		long q[]=new long[B];
		long r[]=new long[C];
		for(int i=0;i<A;i++) {
			p[i]=sc.nextLong();
		}
		for(int i=0;i<B;i++) {
			q[i]=sc.nextLong();
		}
		for(int i=0;i<C;i++) {
			r[i]=sc.nextLong();
		}
		Arrays.sort(p);
		Arrays.sort(q);
		Arrays.sort(r);
		for(int rednow=A-1;X>0;rednow--,X--) {
			if(p[rednow]<r[C-1]) {
				break;
			}else {
				ans+=p[rednow];
			}
		}
		for(int greennow=B-1;Y>0;greennow--,Y--) {
			if(q[greennow]<r[C-1]) {
				break;
			}else {
				ans+=q[greennow];
			}
		}
		int redpoint=A-X;
		int greenpoint=B-Y;
		int nonow=C-1;
		while(!(X==0&&Y==0)) {
			if(X!=0&&Y!=0) {
				if(p[redpoint]>q[greenpoint]) {
					ans+=r[nonow];
					nonow--;
					greenpoint++;
					Y--;
				}else {
					ans+=r[nonow];
					nonow--;
					redpoint++;
					X--;
				}
			}else if(X!=0){
				if(r[nonow]>p[redpoint]) {
				ans+=r[nonow];
				nonow--;
				redpoint++;
				X--;}else {
					ans+=p[redpoint];
					redpoint++;
				}

			}else {
				if(r[nonow]>q[greenpoint]) {
				ans+=r[nonow];
				nonow--;
				greenpoint++;
				Y--;}else {
					ans+=p[greenpoint];
					greenpoint++;
				}
			}

		}

		System.out.println(ans);


	}
}