import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		if (N%4==0) {
			System.out.println(3*N/4+" "+3*N/4+" "+3*N/4);
			return ;
		}
		for (long h =1;h<=3500;h++) {
			for (long w=1;w<=3500;w++) {
				long temp= N * h * w;
				long t = 4*h*w-N*(h+w);
				if (t>0&&temp%t==0) {
					System.out.println(h+" "+w+" "+temp/t);
					return ;
				}
			}
		}
	}
}