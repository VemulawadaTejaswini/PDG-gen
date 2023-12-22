import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc  = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] an = new int[n];
		String answer = "YES";
		for (int i = 0;i<n;i++) {
			an[i] = sc.nextInt();
			for(int j = 1;j<i;j++) {
				if(an[j]==an[i]) {
					answer= "NO";
				}
			}
		}
		System.out.print(answer);
	}

}