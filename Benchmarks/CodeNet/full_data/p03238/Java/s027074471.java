import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		//入力表示
		int N= sc.nextInt();
      
		//N=1だったら表示
        //N=2だったら計算をする
		if(N==1) {
			System.out.println("Hello World");
			
		}else if(N==2) {
			int A= sc.nextInt();
			int B= sc.nextInt();
			System.out.println(A+B);
		}
	}
}
