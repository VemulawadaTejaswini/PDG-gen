import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		int[] length = {A,B,C};

		int ans;

		if(A%2==0|B%2==0|C%2==0){
			ans =0;
		}else{
			Arrays.sort(length);
			ans = length[0]*length[1];
		}
		System.out.println(ans);
	}

}
