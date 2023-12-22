import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();

		for(int i = 0; i < n; i++) {
			al.add(sc.nextInt());
		}
		for(int i = 0; i < n; i++) {
			ArrayList<Integer> x = new ArrayList<>(al);
			x.remove(i);
			Collections.sort(x);
			System.out.println(x.get(x.size()/2));
		}
	}
}