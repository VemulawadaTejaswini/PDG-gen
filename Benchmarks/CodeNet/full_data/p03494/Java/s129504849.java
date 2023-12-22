import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int maxNum = scan.nextInt();
		List<Integer> numArray = new ArrayList<Integer>();
		for(int i = 0; i < maxNum; ++i) {
			numArray.add(scan.nextInt());
		}
		scan.close();

		int count = 0;
		while(true) {
			boolean finishFlg = false;
			for(int i=0; i < numArray.size(); ++i) {
				// 2で割れるなら割って更新
				if(numArray.get(i) % 2 == 0) {
					numArray.set(i, numArray.get(i) / 2);
				} else {
					finishFlg = true;
					break;
				}
			}
			if(finishFlg) break;
			count++;
		}
		System.out.println(count);
	}
}
