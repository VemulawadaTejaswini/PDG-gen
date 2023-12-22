import java.util.Scanner;
public class Practice190216 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();
		int max;
		if(A <= B) {
			if(B <= C) {
				max = C;
			}else {
				max = B;
			}
		}else {
			if(A <= C) {
				max = C;
			}else {
				max = A;
			}
		}
		if(max == A) {
			max = max * (K * 2);
			max = max + B + C;
		}else if(max == B) {
			max = max * (K * 2);
			max = max + A + C;
		}else {
			max = max * (K * 2);
			max = max + B + A;
		}
		System.out.println(max);
	}
}