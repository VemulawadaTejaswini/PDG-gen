
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(),sum=0;
		int[] w = new int[n];

		for(int i = 0;i < n; i++) {
			w[i] = in.nextInt();
			sum+= w[i];
		}

		int hrf = sum/2;
		int j = 0,tmp=0;
		int s1 = 0, s2 = sum;
		while(s1 < hrf) {
			tmp = w[j];
			s1 += tmp;
			s2 -= tmp;
			j++;
		}

		int min = s1 - s2;
		s1 -= tmp;
		s2 += tmp;
		min = (min > s2 - s1) ? s2 - s1: min;
		min = (min < 0) ? min * -1: min;
		System.out.println(min);
	}

}
