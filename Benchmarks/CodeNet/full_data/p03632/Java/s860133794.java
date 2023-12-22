import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		//入力から1つずつ値を取得する。
		Scanner scan = new Scanner(System.in);

		//B-A(D-C)を実施する。
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		//比較用のlistを準備する
		List<Integer> alice = new ArrayList<>();
		List<Integer> bob = new ArrayList<>();

		//差分だけ、for文ループを回す。
		//alice
		for(int i=a; i<=b; i++) {
			alice.add(i);
		}
		//bobの文
		for(int i=c; i<=d; i++) {
			bob.add(i);
		}

		//listの中身を比較して、重複を、新規で用意したlistに格納する。
		//比較結果用のlist
		List<Integer> resultList = new ArrayList<>();

		for(int strAlice:alice) {
			for(int strBob:bob) {
				if(strAlice==strBob) {
					resultList.add(strAlice);
				}
			}
		}

		//listのサイズを出力する。
		if(resultList.isEmpty()) {
			System.out.println("0");
		}
		else {
			System.out.println(resultList.get(resultList.size()-1)-resultList.get(0));	
		}
	}
}
