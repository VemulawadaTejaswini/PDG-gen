import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		long R = sc.nextLong();
		long i = l;
		long j = i+1;
		System.out.println((i*j)%2019);
	}

}
