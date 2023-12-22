import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long min = 1+a;
		for(int i = 2; i <= Math.sqrt(a); i++) {
          	double c = a%i;
			if(c==0) {
				long d = a/i;
				long tmp = d+i;
				if(tmp<min) {
					min = tmp;
				}
			}
		}
		System.out.println(min-2);
	}

}
