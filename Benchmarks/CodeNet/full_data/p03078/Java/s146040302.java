
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> deli = new ArrayList<>();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int[] xlist = new int[x];
		int[] ylist = new int[y];
		int[] zlist = new int[z];
		for(int i = 0; i < x; i++) {
			xlist[i] = sc.nextInt();
		}
		for(int i = 0; i < y; i++) {
			ylist[i] = sc.nextInt();
		}
		for(int i = 0; i < z; i++) {
			zlist[i] = sc.nextInt();
		}
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				for(int k = 0; k < z; k++) {
					deli.add(xlist[i] + ylist[j] + zlist[k]);
				}
			}
		}
		deli.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
