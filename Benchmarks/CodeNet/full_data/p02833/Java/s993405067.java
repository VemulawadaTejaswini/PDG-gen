import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String buff = String.valueOf(res(n));
		long count =0;

		for(int i=0;i<buff.length();i++) {
			if(buff.substring(i,i).equals("0")) {
				count++;
			}
		}
		System.out.println(count);

	}

	public static long res(long n) {
		if(n<2) {
			return 1;
		}

		return n*res(n-2);
	}
}


