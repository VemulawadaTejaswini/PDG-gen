import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long count =0;
		long temp = N/K;
		count +=temp*(temp-1)*(temp-2)+temp+temp*(temp-1)*3;
		if (K%2==0) {
			temp = N/(K/2)-N/K;
			count +=temp*(temp-1)*(temp-2)+temp+temp*(temp-1)*3;
		}
		System.out.println(count);
	}
}