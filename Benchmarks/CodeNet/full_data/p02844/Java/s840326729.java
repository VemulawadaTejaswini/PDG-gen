import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String s = sc.next();
		HashSet<String>pin = new HashSet<String>();

		for (int i=0; i<n-2; i++){
			for (int j=i+1; j<n-1; j++){
				for (int k= j+1; k<n; k++){
					pin.add(String.valueOf(s.charAt(i)) +
							String.valueOf(s.charAt(j)) +
							String.valueOf(s.charAt(k)));
				}
			}
		}
		System.out.println(pin.size());
	}
}