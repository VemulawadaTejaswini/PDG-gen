import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long d = sc.nextLong();
		long x = n / 2019;
		long y = d / 2019;
System.out.println(x);
System.out.println(y);
		//0
		// d*(d-1)
		// n*(n+1)
		//51(d-n)
		if (x != y) {
			System.out.println(0);
		} else {
			if(d%2019>=46){
				System.out.println(51);
			}else{
				System.out.println((n%2019)*((n+1)%2019));
			}



		}
	}
}