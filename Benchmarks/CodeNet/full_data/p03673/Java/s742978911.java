import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		ArrayList b = new ArrayList();
		String str = "";

		for (int i = 0; i < n; i++){
			b.add(scan.nextInt());
			Collections.reverse(b);
		}

		str = b.get(0).toString();
		for (int i = 1; i < n; i++){
			str = str + " " + b.get(i).toString();
		}

		System.out.println(str);
	}
}