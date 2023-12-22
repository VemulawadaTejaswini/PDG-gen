import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long m = scanner.nextLong();
		if(n*2 < m) {
			System.out.println((n * 2 + m) / 4);
		}else if(n*2 > m){
			System.out.println( m/4);
		}else{
			System.out.println(n);
		}
	}
}