import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.valueOf(sc.nextLine());
		String sArray[] = new String[N];
		String sArraySub[] = new String[N];

		for (int i = 0; i < N; i++) {
			sArray[i] = sc.nextLine();
			sArraySub[i] = sArray[i].split(" ")[0] + " " + (Integer.valueOf(sArray[i].split(" ")[1]) - 101);
		}

		List lst = new ArrayList<String>();
		lst = Arrays.asList(sArraySub);
		Collections.sort(lst);

		for (int i = 0; i < N; i++) {
			sArraySub[i] = sArraySub[i].split(" ")[0] + " " + (Integer.valueOf(sArraySub[i].split(" ")[1]) + 101);
		}

		for (int i = 0; i < N; i++) {
			System.out.println(Arrays.asList(sArray).indexOf(lst.get(i)) + 1);
		}
	}
}
