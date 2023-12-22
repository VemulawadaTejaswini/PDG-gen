import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i=0; i<n; i++){
			hs.add(sc.nextInt());
		}
		System.out.println(hs.size());
	}
}
