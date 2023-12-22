import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		ArrayList<Long> color = new ArrayList<Long>();
		for (int i = 0; i < N; i++) {
			long a = scn.nextLong();
			boolean didnt = true;
			for(int j = 0;j < color.size();j++) {
				if(color.get(j) < a) {
					color.set(j, a);
					didnt = false;
					break;
				}
			}
			if(didnt) {
				color.add(a);
			}
		}
		System.out.println(color.size());
	}

}