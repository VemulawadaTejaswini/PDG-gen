import java.util.Scanner;
public class Main {
	static int[] Shichigo = new int[1100000];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int s,cnt = 0;
		s = N;
		for(int i = 0;i < 4;i ++) {
			if((s % 10) == 2) cnt++;
			//System.out.println(s%10);
			s = s / 10;
		}
		System.out.println(cnt);
	}
}