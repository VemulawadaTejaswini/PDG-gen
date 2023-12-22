import java.util.Scanner;

public class Main {
	public static boolean enough(long a, long b, long[] enemyTairyoku, long t) {
		long count = 0;
		for(int i=0; i<enemyTairyoku.length; i++) {
			if(enemyTairyoku[i]>b*t) {
				count += (int)Math.ceil((enemyTairyoku[i]-b*t)/((double)a-b));
			}
		}
/*		if (count <= t)
			System.out.println(t + " yes");
		else
			System.out.println(t + " no");*/
		return count <= t;
	}
	public static long calcMinAttackNum(long a, long b, long[] enemyTairyoku) {
		long min = 0;
		long max = 1000000000;
		while(min+1<max) {
			long c = (min+max)/2;
			if(enough(a, b, enemyTairyoku, c)) {
				max = c;
			} else {
				min = c;
			}
//			System.out.println(min + " " + max);
		}
		return min == max ? min + 1 : max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = sc.nextInt();
		long b = sc.nextInt();
		long[] enemyTairyoku = new long[n];
		for(int i=0; i<enemyTairyoku.length; i++)
			enemyTairyoku[i] = sc.nextInt();
		sc.close();

		System.out.println(calcMinAttackNum(a, b, enemyTairyoku));
	}
}

