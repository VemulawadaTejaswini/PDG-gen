import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		in.nextInt();
		int n = in.nextInt()*10 + in.nextInt();
		if(n % 4 == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		in.close();
	}

}