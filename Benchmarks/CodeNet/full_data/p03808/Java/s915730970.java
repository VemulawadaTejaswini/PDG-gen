import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
		int save = 0;
		int num = 0;
		while(save < sum) {
			num++;
			save += num;
		}
		if (save == sum) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
