import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> rods = new ArrayList<>();
		ArrayList<Integer> rodsCount = new ArrayList<>();

		for(int i = 0; i < N; i++) {
			int input = sc.nextInt();
			boolean flag = true;
			for(int j = 0; j < rods.size(); j++) {
				if(input == rods.get(j)) {
					flag = false;
					rodsCount.set(j, rodsCount.get(j)+1);
					break;
				}
			}

			if(flag) {
				rods.add(input);
				rodsCount.add(1);
			}
		}

		int a = 0;
		int b = 0;
		int index = -1;

		for(int i = 0; i < rods.size(); i++) {
			if(rodsCount.get(i) > 1) {
				if(rods.get(i) > a) {
					a = rods.get(i);
					index = i;
				}
			}
		}
		if(index > -1) {
			rodsCount.set(index, rodsCount.get(index)-2);
		}


		for(int i = 0; i < rods.size(); i++) {
			if(rodsCount.get(i) > 1) {
				if(rods.get(i) > b) {
					b = rods.get(i);
					index = i;
				}
			}
		}

		System.out.println(a * b);


	}
}