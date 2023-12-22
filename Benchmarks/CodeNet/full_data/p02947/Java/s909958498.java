import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String renketu = "";
		String s[] = new String[n];
		String t[] = new String[n];
		String tani[];
		String tani2[];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			tani = s[i].split("");
			Arrays.sort(tani);
			renketu="";
			for (int j = 0; j < 10; j++) {
				renketu += tani[j];
			}
			t[i] = renketu;
		}
		int cnt = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {			
				if (t[i].equals(t[j])) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
    }
}