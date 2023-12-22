import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int S[] = new int[N];
		for(int i = 0;i < N;i++) {
			S[i] = sc.nextInt();
		}
		Arrays.sort(S);
		int count = 0;
		for(int i = 0;i < S.length;i++) {
			if(S[i] == S[i+1])count++;
		}
		System.out.println(count);







	}

}
