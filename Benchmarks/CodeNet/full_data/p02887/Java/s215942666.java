import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();

		String [] a = new String[n];

		for(int i = 0; i < n; i++) {
			a[i] = stdIn.next();
		}
		for(int i = 0; i < n; i++) {
			if(a[i]==a[i+1]) {
				n--;
			}
		}
		System.out.println(n);
	}

}
