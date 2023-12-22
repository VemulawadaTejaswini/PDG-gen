import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int targetNumber = n/2 -1;
		List<Integer> numberList = new ArrayList<>();
		for(int i=0;i<n;i++) {
			numberList.add(sc.nextInt());
		}
		sc.close();
		int out = 0;
		for(int i=0;i<n;i++) {
			List<Integer> targetList = new ArrayList<>(numberList);
			targetList.remove(out);
			Collections.sort(targetList, Collections.reverseOrder());
	        System.out.println(targetList.get(targetNumber));
	        out++;
		}
	}
}