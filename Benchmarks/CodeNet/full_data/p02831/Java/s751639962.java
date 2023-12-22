import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int A = sc.nextInt();
		int B = sc.nextInt();

		int temp = 0;
		List<Integer> list = new ArrayList<Integer>();
		while((temp = A%B)!=0) {
			list.add(temp);
			A = B;
			B = temp;
		}
		list.add(A);
		for(int i = 0; i<=list.size(); i++) {
			total += list.get(i);
		}

		System.out.println(total);



	}
}