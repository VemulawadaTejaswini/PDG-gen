import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int min = Integer.MAX_VALUE;
		int max = -1;
		for(int i = 0; i < n; i++){
			int a = in.nextInt();
			if(a > max) max = a;
			if(a < min) min = a;
		}
		System.out.println(max-min);
		in.close();
	}

}