import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int participants = sc.nextInt();  //参加人数
		int point = sc.nextInt();  //ポイント
		int questions = sc.nextInt();  //問題数
		int winner[] = new int[questions];
		Map<Integer, Integer> resultMap = new HashMap<>();

		//問題の正解者を入力
		for(int i=0 ; i<questions ; i++) {
			winner[i] = sc.nextInt();
		}

		//参加者番号(key)とポイント(value)を入力
		for(int j=1 ; j<=participants ; j++) {
			resultMap.put(j, point);
		}

		//「key＝正解者」でない人のvalueから1引く
		for(int i=0 ; i<questions ; i++) {
			for(int key : resultMap.keySet()) {
				if(key != winner[i]) {
					resultMap.put(key, resultMap.get(key)-1);
				}
			}
		}

		for(int x : resultMap.keySet()) {
			System.out.println(resultMap.get(x) > 0 ? "Yes" : "No");
		}
		sc.close();
	}
}