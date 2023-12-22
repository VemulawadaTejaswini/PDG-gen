import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int answer = 50;
		for(int i=0;i<n;i++) {
			int kazu=sc.nextInt();
			int amari=kazu%2;
			int kaisuu=0;
			while(amari==0) {
				kazu=kazu/2;
				amari=kazu%2;
				kaisuu++;
			}
			if(answer>kaisuu) {
				answer=kaisuu;
			}
		}
		System.out.print(answer);


	}

}