import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
 
		Scanner scanner = new Scanner(System.in);
 
		//入力表示
		int N = scanner.nextInt();
		int B = 0;
 
		if (N % 2 == 0) {
			B = N / 2;
		
		} else {
			B = N / 2 + 1;
		}
 
	 System.out.println((double)B/N); 
    }
}