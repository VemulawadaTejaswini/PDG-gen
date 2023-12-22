import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}

		int count = 0;
		for(int i=0; i<list.size(); i++) {
			int love = list.get(i);
			if((i + 1) == (list.get(love - 1))) count++;
		}

		System.out.println(count/2);
	}
}