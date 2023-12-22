import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int max=0;
		int min=0;
		if(N >= 1 && N<=100) {
			if(A+B<=N) {
				if(A>B) {
					max = B;
					min = 0;
				}else if (A<=B) {
					max = A;
					min = 0;
				}
			}
			if(A+B>N) {
				if(A>B) {
					max = B;
					min = A-B;
				}else if(A<B) {
					max = A;
					min = B-A;
				}
			}
			if(A==B && A==N) {
				max = N;
				min = N;
			}
			if(A+B==N && A==B) {
				max = 0;
				min = 0;
			}if(A+B>N&&A==B) {
				max = A;
				min = A;
			}
		}
		System.out.println(max +" "+ min);




	}
}
