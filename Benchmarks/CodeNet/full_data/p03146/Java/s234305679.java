import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int s = sc.nextInt();
		int nextVal = 0;
		boolean isExist = false;
		int cnt = 0;

		ArrayList<Integer> aryList = new ArrayList<Integer>();
		aryList.add(s);

		while(!isExist){
			nextVal = calc(s);

			if(aryList.contains(nextVal)){
				cnt = aryList.size() + 1;
 				isExist = true;
			}

            aryList.add(nextVal);
			s = nextVal;
		}

		System.out.println(cnt);

		sc.close();
	}

	private static int calc(int target){
		int ret = 0;

		if(target%2 == 0){
			ret = target / 2;
		}else{
			ret = 3 * target + 1;
		}

		return ret;
	}
}