import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		//必殺技を攻撃力が高い順にソート
		Collections.sort(list, Collections.reverseOrder());

		//判定フラグ
		boolean check = false;
		for(int i = 0; i < list.size(); i++) {
			H -= list.get(i);
			if(H <= 0) {
				check = true;
				break;
			}else {
				continue;
			}
		}
		System.out.println(check ? "Yes" : "No");
	}
}