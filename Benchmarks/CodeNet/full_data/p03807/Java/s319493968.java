import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int oddCount =0;
		int evalCount =0;

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(a%2==0){
				oddCount++;
			}else{
				evalCount++;
			}
			list.add(a);
		}

		if(evalCount==0){
			System.out.println("YES");
		}else if (evalCount%2==0){
			System.out.println("YES");
		}else if (evalCount==1){
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

