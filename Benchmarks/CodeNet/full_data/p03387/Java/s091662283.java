import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		sc.close();
		int[] array = {A,B,C};
		Arrays.sort(array);
		int min = array[0];
		int mid = array[1];
		int max = array[2];
		int cnt = 0;
		cnt += max - mid;
		if((max-(min+cnt))%2==0) {
			cnt += (max-(min+cnt))/2;
		}else {
			cnt += ((max+1)-(min+cnt))/2+1;
		}
		System.out.println(cnt);
	}
}