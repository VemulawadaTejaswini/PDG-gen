import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min =1000000000;
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int cut = 0;
			while(a%2 ==0) {
				cut++;
				a/=2;
			}
			min = Math.min(min, cut);
		}
		System.out.println(min);
	}
}