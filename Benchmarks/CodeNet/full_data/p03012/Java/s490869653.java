
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

		//Arrays.sort(w);

		int j = 0;
		int hi = sum,low = 0;
		while(hi > low) {
			hi -= w[j];
			low += w[j];
			j++;
		}

		System.out.println(low - hi);
	}

}
