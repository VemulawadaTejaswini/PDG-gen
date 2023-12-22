import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int a = scanner.nextInt();



		ArrayList<Integer> list = new ArrayList<Integer>();



		for(int i = 0; i<x; i++) {
			if(a-i != a+i) {
				if(a-i>-1000000) {
					list.add(a-i);
				}
				if(a-i<1000000) {
					list.add(a+i);
				}
			}else {
				list.add(a-i);
			}
		}


		Collections.sort(list);
		for(int num: list) {
			System.out.print(num+" ");

		}


	}
}