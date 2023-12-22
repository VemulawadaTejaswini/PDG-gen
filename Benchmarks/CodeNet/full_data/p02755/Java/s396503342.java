import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		if(A>B) {
			System.out.println(-1);
			return;
		}
//
//		double double125A = (double)A * 1.25;
//		double doubleB = (double)B;
//		if(doubleB > double125A || (double125A > doubleB && 12.5*(double)A - 10*(double)B > 12.5)) {
//			System.out.println(-1);
//		} else {
//			int resultA = ((double)A*12.5)*2 % 2 == 0 ? (int)(A*12.5) : (int)(A*12.5)+1;
//			System.out.println(Math.max(resultA, (int)(B*10)));
//		}

		int min = 0;
		for (int i = 1; i <= 1009; i++) {
			int i008 = (int)(i*0.08);
			int i010 = (int)(i*0.1);
			if(i008 == A && i010 == B) {
				min = i;
				break;
			}
		}
		if(min==0){
			System.out.println(-1);
		} else {
			System.out.println(min);
		}
	}
}