import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> x = new ArrayList<>();
		int n = sc.nextInt();
		int m = sc.nextInt();

		for(int i=0; i<m; i++) {
			x.add(sc.nextInt());
		}
		x.sort(null);
		List<Integer> dif = new ArrayList<>();
		for(int i=0;i<x.size()-1;i++) {
			dif.add(x.get(i+1)-x.get(i));
		}
		dif.sort(null);
		int sum = 0;
		for(int i=0;i<dif.size()-n+1;i++) {
			sum = sum + dif.get(i);
		}
		System.out.println(sum);
	}
}
