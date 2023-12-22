import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		long x = Long.parseLong(sc.next());
		sc.close();

		long result = 0;
		if(a==0) {
			result += b/x + 1;
		}else {
			if(a%x == 0) {
				result += b/x - a/x + 1;
			}else {
				result += b/x -a/x;
			}
		}
		System.out.println(result);
	}
}