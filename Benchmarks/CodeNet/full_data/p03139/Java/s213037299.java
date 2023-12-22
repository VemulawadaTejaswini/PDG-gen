import java.util.Scanner;

public class q1koudoku {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nmax = sc.nextInt();
		int anum = sc.nextInt();
		int bnum = sc.nextInt();

		int nummax = 0;
		int nummin = 0;

		if(anum < bnum) {
			nummax = anum;
		}else {
			nummax = bnum;
		}
		System.out.println(nummax);

		nummin = nmax - anum - bnum;

		if (nummin > 0) {
			System.out.println(0);
		}else {
			System.out.println(Math.abs(nummin));
		}

	    sc.close();

	}

}