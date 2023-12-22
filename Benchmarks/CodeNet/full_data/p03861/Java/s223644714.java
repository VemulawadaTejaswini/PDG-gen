import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		long x = Long.parseLong(sc.next());
		sc.close();

		long cnt = 0l;
		for(long i = a;i <= b;i++) {
			if(i%x==0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}