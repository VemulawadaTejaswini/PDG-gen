import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long x = sc.nextLong();
		long ans = 0;


		if(n/2 == x){
			System.out.println((n*2-2) + (n-1));
		}else if(n/2 > x){
			System.out.println(n*2+1);
		}else {
			System.out.println((n*2-2)+(n-1));
		}


		sc.close();
	}

}
