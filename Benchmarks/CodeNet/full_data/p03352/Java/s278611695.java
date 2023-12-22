import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int max = 0;
		if(x == 1) {
			max = 1;
		} else if(x == 2) {
			max = 2;
		} else {
			int maxnum = (int)Math.sqrt(x);
			for(int i = 2; i <= maxnum; i++) {
				int tmp = i;
				while(true) {
					tmp =  tmp * i;
					if(tmp > x) {
						max = Math.max(max, tmp/i);
						break;
					}
				}
			}
		}
		System.out.println(max);
	}
}
