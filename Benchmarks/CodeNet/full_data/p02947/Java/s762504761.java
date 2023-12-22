import java.util.Arrays;
import java.util.Scanner;

public class Mian {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String renketu = "";
		String s[] = new String[n];
		String t[] = new String[n];
		char tani[];

		for (int i = 0; i < n; i++) {
			tani = sc.next().toCharArray();
			Arrays.sort(tani);
			 t[i]=String.valueOf(tani);
		}
		for(String a:t) {
		System.out.println(a);
		}
		Arrays.sort(t);
		int cnt = 0, sum = 0;
		for (int i = 0; i < n - 1; i++) {
			if (t[i].equals(t[i + 1])) {
				cnt++;
			} else {
				sum += (cnt) * (cnt + 1) / 2;
				cnt = 0;
			}
		}
		sum += (cnt) * (cnt + 1) / 2;
		System.out.println(sum);
    }
}