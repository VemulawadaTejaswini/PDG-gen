import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int nums = sc.nextInt();

			ArrayList<Integer> list = new ArrayList<Integer>();

			for(int i =0;i<nums;i++) {
				list.add(sc.nextInt());
			}


			Collections.sort(list);

			int num = list.get(list.size()-1) - list.get(0);

			System.out.println(num);



	}


}


