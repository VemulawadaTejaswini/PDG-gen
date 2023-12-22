import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String last = "";
		String first = "";
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String W = sc.next();
		ArrayList<String> ws = new ArrayList<String>();
		int judge = 0;
		for(int i = 0;i < N -1; i++) {
			ws.add(W);

			last = W.substring(W.length()-1);
			W = sc.next();
			first = W.substring(0,1);//次の文字

			if(!(last.equals(first))) {
				++judge;
			}

			if(ws.contains(W)){
				++judge;
			}

		}


		if(judge == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}