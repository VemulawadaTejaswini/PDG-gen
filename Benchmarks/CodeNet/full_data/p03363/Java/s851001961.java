import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		long N=scan.nextLong();
		Long A[]=new Long[(int)(N+1)];
		A[0]=(long) 0;
		A[1]=scan.nextLong();
		for(long i=2;i<N+1;i++) {
			long c=scan.nextLong();
			A[(int)i]=A[(int)(i-1)]+c;
		}
		long ans=0;
		Arrays.sort(A);
		long count=0;
		for(long i=1;i<N+1;i++) {
			if(A[(int)i]!=A[(int)(i-1)]) {
				if(co!=0) {
				ans+=(count+1)*count/2;
				count=0;
				}
			}
			else {
				count++;
			}
		}
		ans+=(count+1)*count/2;
		System.out.println(ans);
	}
}
