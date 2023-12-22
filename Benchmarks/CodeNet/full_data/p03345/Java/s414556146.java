import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long K = sc.nextLong();
		long min;

		min=Math.min(A, B);
		min=Math.min(min, C);

		A-=min;
		B-=min;
		C-=min;

		long sum=0;
		/*
		for(long n=0;n<K;n++) {
			sum=A+B+C;
			A=sum-A;
			B=sum-B;
			C=sum-C;
		}
		*/
			sum+=(A*2+B*2+C*2)*K;
			if(K!=0) {
			A=sum-A*K;
			B=sum-B*K;
			C=sum-C*K;
			}
		if(Math.abs(A-B)>1000000000000000000l) {
			System.out.println("Unfair");
		}else {
			System.out.println(A-B);
		}
	}

}
