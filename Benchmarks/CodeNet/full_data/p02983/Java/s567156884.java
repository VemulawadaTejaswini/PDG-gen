import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long L = scan.nextLong();
		long R = scan.nextLong();
		long minl = Long.MAX_VALUE;
		long minr = Long.MAX_VALUE;
		long min = Long.MAX_VALUE;

		for(long i=2;i<=2019;i++) {
			if(L*R >=2019) {
			minl = Math.min(minl, (L*i)%2019);
			minr = Math.min(minr, (L*i)%2019);
			}else {
				min = L*R;
			}
			if(minl == minr) {
				min =i;
			}
		}

		System.out.println(min);
		scan.close();

	}

}
