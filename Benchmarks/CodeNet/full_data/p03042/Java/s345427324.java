import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.next();
		String mae = s.substring(0, 2);
		String ushiro = s.substring(2, 4);
		int maeNum = Integer.parseInt(mae);
		int ushiroNum = Integer.parseInt(ushiro);

		if (!isMonth(maeNum)  && !isMonth(ushiroNum)) {
			System.out.println("NA");
		} else if (isMonth(maeNum)  && isMonth(ushiroNum)) {
			System.out.println("AMBIGUOUS");
		} else if (isMonth(maeNum)  && !isMonth(ushiroNum)) {
			System.out.println("MMYY");
		} else if (!isMonth(maeNum)  && isMonth(ushiroNum)) {
			System.out.println("YYMM");
		}

	}

	private static boolean isMonth(int num){
		return num<13 && num>0;
	}
}
