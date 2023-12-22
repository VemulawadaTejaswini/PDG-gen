import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long h=scan.nextLong();
		long w=scan.nextLong();
		scan.close();

		long ans = 0;
		if(w % 2==0 || h%2==0) {
			ans = w*h/2;
		}else {
			ans = w*h/2+1;
		}
		System.out.println(ans);
	}

}