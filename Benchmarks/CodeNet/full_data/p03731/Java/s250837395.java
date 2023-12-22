import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner cin = new Scanner(System.in);

		int N = cin.nextInt();
		long T = cin.nextLong();

		long tmp = 0L;
		long before = cin.nextLong();
		long sum =0L;

		for(int i=0;i<N-1;i++){
			if(i>0&&tmp-before<T){
				sum += T-(tmp-before);
			}
			before = tmp;
			tmp = cin.nextLong();
		}
		System.out.println(N*T-sum);
	}
}