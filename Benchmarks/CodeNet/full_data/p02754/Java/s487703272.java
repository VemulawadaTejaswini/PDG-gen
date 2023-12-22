import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();
		Long A = sc.nextLong();
		Long B = sc.nextLong();

		Long na = 0L;
//		int nb = 0;

		do {
			if(N > A) {
				N = N - A;
				if(N <= 0L) {
					break;
				}
				na = na + A;
//				System.out.println(na);
			}else {
				na = na + N;				
//				System.out.println("*"+na);
				break;
			}
			if(N > B) {
				N = N - B;
				if(N <= 0L) {
					break;
				}
//				nb = nb + B;
			}else {
//				nb = nb + N;
				break;
			}
		}while(N != 0);

		System.out.println(na);
		sc.close();
	}
}