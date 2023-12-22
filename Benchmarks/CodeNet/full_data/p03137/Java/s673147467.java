import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int place = sc.nextInt();
		Integer point[] = new Integer[place];
		for(int i = 0; i < place; i ++) {
			point[i] = sc.nextInt();
		}
		Arrays.sort(point, Collections.reverseOrder());
		long diff[] = new long[place - 1];
		for(int i = 0; i < place - 1; i ++) {
			diff[i] = point[i] - point[i + 1];
		}
		long sum = 0;
		Arrays.sort(diff);
		if(num < place) {
			for(int i = 0; i < place - num; i ++) {
				sum += diff[i];
			}
		}
		System.out.println(sum);
	}
}