
import java.util.Scanner;

public class Main {

	public static void main (String[] args)  {

		Scanner sc = new Scanner(System.in);
		long t1 = sc.nextLong();
		long t2 = sc.nextLong();
		long a1 = sc.nextLong();
		long a2 = sc.nextLong();
		long b1 = sc.nextLong();
		long b2 = sc.nextLong();
		
		long c1 = a1-b1;
		long c2 = a2-b2;

		long total = c1*t1+c2*t2;
		long mid = c1*t1;
		if (total==0) {
			System.out.println("infinity");

		} else if ((total>0 && mid>0) || (total<0 && mid<0)){
			System.out.println(0);

		} else if (mid%total==0){
			System.out.println(-mid/total*2);
		} else {
			System.out.println(-mid/total*2+1);
		}
	}

}


