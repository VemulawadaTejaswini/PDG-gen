import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d,sum = 0,max =0;
		for(int i = 0; i < 5; i++) {
			d = sc.nextInt();
			int t = 0;
			t += Math.ceil((double)d/ 10) * 10;
			sum += t;
			if(max < t - d) {
				max = t-d;
			}
		}
		System.out.println(sum - max);
		sc.close();
	}
}