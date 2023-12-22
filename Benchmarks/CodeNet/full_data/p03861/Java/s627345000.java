import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n1 = sc.nextLong();
		long n2 = sc.nextLong();
		long div = sc.nextLong();
		sc.close();
		int count = 0;
		while(n1 != n2+1){
			if(n1 % div ==0) count++;
			n1++;
		}
		System.out.println(count);
	}
}