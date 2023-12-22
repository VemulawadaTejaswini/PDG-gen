import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		ArrayList<Integer> list = new ArrayList<Integer>();
		long answer = 0;
		long const_number = 1000000007;
		for(int i=0;i<N;i++) {
			list.add(sc.nextInt());
		}
		long total=0;
		for(int i=1;i<N;i++) {
			for(int j=1;j<=i;j++) {
				total+=(list.get(i)-list.get(i-1))*factorial(N-1)/j;
			}
			total=total%1000000007;
		}
		System.out.println(total);
	}
	
	static long factorial(long n) {
		if(n==0) {
			return 1;
		}else {
			return  n*factorial(n-1);
		}
	}
	
}
