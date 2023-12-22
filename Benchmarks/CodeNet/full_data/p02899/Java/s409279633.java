import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 1;

		for(int i = 0;i < n;i++) {
			list.add(scan.nextInt());
		}

		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {
				if(list.get(j) == count) {
					System.out.print(list.indexOf(list.get(j)) + 1 + " ");
					count++;
				}
			}
		}
	}
}
