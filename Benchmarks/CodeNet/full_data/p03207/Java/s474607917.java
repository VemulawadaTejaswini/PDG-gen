import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		// スペース区切りの整数の入力
      ArrayList<Integer> upList = new ArrayList<Integer>();
      while (sc.hasNextInt()) {
        upList.add(sc.nextInt());
      }
      int moExp = 0;
      int sum = 0;
      for (int i = 0; i < upList.size(); i++) {
        if (moExp < upList.get(i)) {
          moExp = upList.get(i);
        }
        sum = sum += upList.get(i);
      }
      sum = sum - (moExp / 2);
		
		
		// 出力
		System.out.println(sum);
	}
}