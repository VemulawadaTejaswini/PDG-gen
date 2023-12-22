import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		int T = sc.nextInt();
		int[] list = new int[T];
		int sum = 0;
		for(int i=0;i<T;i++) {
			list[i] = sc.nextInt();
			sum += list[i];
		}
		sc.close();
		Arrays.sort(list);
		int max = list[list.length-1];
		if(sum%2==0) {
			max --;
			for(int i=0;i<list.length-1;i++) {
				max -= list[i];
			}
		} else {
			max ++;
			for(int i=0;i<list.length-1;i++) {
				max -= list[i];
			}
		}
		System.out.println(Math.abs(max));
	}
}