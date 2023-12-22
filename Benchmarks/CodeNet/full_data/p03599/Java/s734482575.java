import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		int E = scan.nextInt();
		int F = scan.nextInt();
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		ArrayList<Integer> x = new ArrayList<>();
		ArrayList<Integer> y = new ArrayList<>();

		while ((100*A*i)<= F) {
			j = 0;
			while ((100*A*i)+(100*B*j) <= F) {
				x.add((100*A*i)+(100*B*j));
				j++;
			}
			i++;
		}
		while ((C*k) <= F) {
			l = 0;
			while ((C*k)+(D*l) <= F) {
				y.add((C*k)+(D*l));
				l++;
			}
			k++;
		}
		for (Integer w : x) {
			for (Integer s : y) {
				if (w+s <= F && w*E >= s*100 && w!=0 && s!=0) {
					System.out.println(w+s+" "+s);
					return;
				}
			}
		}
	}
}
