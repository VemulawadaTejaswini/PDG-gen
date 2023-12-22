import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = sc.nextInt();
		int n = s.length();
		String sub[] = new String[n + (n * (n - 1) / 2)];
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int o = i + 1; o <= n; o++) {
				sub[count] = s.substring(i, o);
				count++;
			}
		}
		for(int i=0;i<sub.length;i++){
			System.out.println(sub[i]);
		}
Arrays.sort(sub);
System.out.println(sub[k-1]);
	}
}