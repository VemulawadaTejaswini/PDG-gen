import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] val = new int[3];
		val[0] = sc.nextInt();
		val[1] = sc.nextInt();
		val[2] = sc.nextInt();
		Arrays.sort(val);

		int cnt = 0;
		while(true) {
			if(val[0] == val[1] && val[0] == val[2])
				break;
			else if( (val[0] == val[1]) && ((val[0] + 1) == val[2]) ) {
				cnt++;
				break;
			} else if( (val[0] + 1 == val[1]) && (val[1] == val[2]) ) {
				cnt += 2;
				break;
			}

			int dif = val[1] - val[0];
			if(dif >= 2) {
				cnt += dif / 2;
				val[0] += (dif / 2) * 2;
			} else {
				int dif2 = val[2] - val[1];
				cnt += dif2;
				val[0] += dif2;
				val[1] += dif2;
			}
			Arrays.sort(val);
		}
		System.out.println(cnt);
	}
}
