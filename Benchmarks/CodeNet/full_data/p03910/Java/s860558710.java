import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		int sum=0;
		for (;max<100000;max++) {
			sum = max *(max+1)/2;
			if (sum >=N) {
				break;
			}
		}
		int now = max ;
		List<Integer> list = new ArrayList<Integer>();
		while (N >now) {
			list.add(now);
			N -=now;
			now--;
		}
		if (N >0) {
			list.add(N);
		}
		Collections.sort(list);
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}