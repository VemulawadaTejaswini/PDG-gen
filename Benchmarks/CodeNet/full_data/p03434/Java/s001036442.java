import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();// N

		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			numList.add(sc.nextInt());
		}

		// ソート（降順）
		Collections.sort(numList, Collections.reverseOrder());

		// 奇数回ならAliceに加点。偶数回ならBobに加点
		int alice = 0;
		int bob = 0;

		for(int i = 0; i < n; i++){
			int point = numList.get(i);
			if(i%2 == 0){
				alice = alice + point; //奇数回 i = 0,2,4,・・・
				//System.out.println("aliceに" + point + "加算");
			}else{
				bob = bob + point; //偶数回 i = 1,3,5,・・・
				//System.out.println("bobに" + point + "加算");
			}
		}

		// 出力
		System.out.println(alice - bob);
	}
}


