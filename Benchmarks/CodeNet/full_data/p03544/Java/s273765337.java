import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		sc.close();
		
		long l = 0L;
		long p = 2L;
		long q = 1L;
		for(int i = 0;i < N-1;i++){
			l = p + q;
			p = q;
			q = l;
		}
		System.out.println(l);
	}
}