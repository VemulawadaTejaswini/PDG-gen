import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int[] list = new int[] {a,b,c};
		Arrays.sort(list);
		int cnt = 0;
		int sbn = list[2] - list[1];
		if(sbn % 2 == 0) {
			cnt += sbn/2;
		} else {
			list[0] ++;
			sbn --;
			cnt += sbn/2 + 1;
		}
		sbn = list[2] - list[0];
		if(sbn % 2 == 0) {
			cnt += sbn/2;
		} else {
			sbn--;
			cnt += sbn/2 + 2;
		}
		System.out.println(cnt);
	}
}