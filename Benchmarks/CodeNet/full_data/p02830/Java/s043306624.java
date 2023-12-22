import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String A = sc.next();
		String B = sc.next();
		String[] a_ = A.split("");
		String[] b_ = B.split("");
		String[] ab = {};

		for(int i=0;i<2*N;i+=2){
			ab[i] = a_[i];
			ab[i+1] = b_[i+1];
		}

		System.out.println(ab);
	}
}
