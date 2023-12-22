import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Long N = scan.nextLong();
		int M = scan.nextInt();
		Long[] A = new Long[M];
		for(int i = 0;i<M;i++) {
			A[i] = scan.nextLong();
		}
		long sumdate = 0;
		long result = -1;

		for(long date:A) {
			sumdate = sumdate+date;
			}
		if(N-sumdate>=0) {
		result = N-sumdate;
		}
		System.out.println(result);
	}
}