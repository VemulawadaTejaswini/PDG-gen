import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int score = 0;
		int cnt_2 = 0;
		for(int i=0;i<N;i++){
			int tmp = sc.nextInt();
			if(tmp%4==0)
				score += 3;
			else if(tmp%2==0){
				cnt_2++;
				if(cnt_2 == 2){
					score += 2;
					cnt_2 = 0;
				}
			}
		}
		if(score>=N)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
