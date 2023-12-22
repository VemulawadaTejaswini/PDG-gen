import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt() + 1;
		int maxTime = sc.nextInt();
		String str = "1"+sc.next();
		int group[] = new int[num];
		int crt = 0;
		int numG = 1;
		group[0] = 0;
		for(int i = 1; i < num; i ++) {
			if(str.charAt(i) != str.charAt(i - 1)) {
				group[numG] = crt;
				numG ++;
			}
			crt ++;
		}
		group[numG] = crt;

		int can[] = new int[numG];
		for(int i = 0; i < numG; i ++) {
			can[i] = group[i + 1] - group[Math.max(0, i - maxTime * 2 + i % 2)];
		}

		int max = 0;
		for(int i = 0; i < numG; i ++) {
			max = Math.max(max, can[i]);
		}
		System.out.println(max);
	}
}