import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String Ns = sc.next();
		sc.close();
		long N = Long.parseLong(Ns);
		long cal = 1;
		long now = N;
		for (long n = 0; n < N ; n++){
			if (now == 0 || now == 1) {
				break;
			} else {
				cal = cal * now;
				now = now - 2;
			}
		}
		long zero = 0;
		long zerocal = cal;
		for (long i = 0;; i++){
			if (zerocal % 10 == 0){
				zerocal = zerocal / 10;
				zero++;
			} else {
				break;
			}
		}
		System.out.println(zero);
	}}