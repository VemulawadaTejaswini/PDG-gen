import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[]save = new String[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			String tmp = sc.next();
			char tmpArray[] = tmp.toCharArray();
			Arrays.sort(tmpArray);
			String afterSort = new String(tmpArray);
			for(int j = 0; j < i; j++) {
				if(save[j].equals(afterSort)) {
					sum += 1;
				}
			}
			save[i] = afterSort;
		}
		System.out.println(sum);
	}

}