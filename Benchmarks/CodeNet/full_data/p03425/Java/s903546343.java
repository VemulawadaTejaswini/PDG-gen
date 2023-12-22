
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[5];
		for(int i = 0; i < 5; i++) {
			list[i] = 0;
		}
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			if(s.charAt(0) == 'M')
				list[0]++;
			else if(s.charAt(0) == 'A')
				list[1]++;
			else if(s.charAt(0) == 'R')
				list[2]++;
			else if(s.charAt(0) == 'C')
				list[3]++;
			else if(s.charAt(0) == 'H')
				list[4]++;
		}
		long ans = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int k = j + 1; k < n; k++) {
					ans += list[i] + list[j] + list[k];
				}
			}
		}
		System.out.println(ans);
	}

}
