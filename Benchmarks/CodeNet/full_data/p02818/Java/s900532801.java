import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		long A = scanner.nextLong();
		long B = scanner.nextLong();
		long K = scanner.nextLong();

		if(K >= A){
			K -= A;
			A = 0;
			if(K >= B){
				B = 0;
			}else{
				B -= K;
			}
		}else{
			A -= K;
		}
		System.out.println(A + " "  + B);
	}
}