import java.util.Scanner;

public class Main {


	public static final long pow(long x, long n) {
	    long sum = 1;
	    while (n > 0) {
	        if ((n & 1) == 1) {
	            sum *= x;
	        }
	        x *= x;
	        n >>= 1;
	    }
	    return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int men = sc.nextInt();
		int mokuhyo = sc.nextInt();
		double answer=0;
		double dicekakuritu = (double)1 / men;
		for (int i = 1; i <= men; i++) {

			int coinnum = 0;
			int value = i;
			while (value < mokuhyo) {
				value *=2;
				coinnum++;
			}
			if(coinnum==0) {
				answer+=dicekakuritu;
			}else {
			double coinkakuritu =(double)1/ pow(2, coinnum);
			answer+=dicekakuritu*coinkakuritu;
			}
		}
		System.out.println(answer);
	}


}

