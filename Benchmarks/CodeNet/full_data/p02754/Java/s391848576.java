import java.util.Scanner;

public class Main{
 
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long A = scan.nextLong();
		long B = scan.nextLong();
		long res = 0;
        long m = 0;
 
		res = A*N/(A+B);
        m = N%(A+B);
		if(m>=A) {
			res = res + A;
		}else {
			res = res + m;
		}
		System.out.println(res);
	}
}