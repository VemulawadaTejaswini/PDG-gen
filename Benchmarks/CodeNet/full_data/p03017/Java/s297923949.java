import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		List<Integer> list = new ArrayList<>();

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		String str = sc.next();
		String[] strArray = str.split("");
		List<Integer> rootLog = new ArrayList<>();

		String stone = "#";
		
		if(stone.equals(strArray[d-1])||stone.equals(strArray[c-1])){
			System.out.println("No");
			return;
		}

		boolean isSuccess =true;
		for(int i=b;i<d-1;i++){
			String curPosition = strArray[i-1];
			if(!curPosition.equals(stone)){
				rootLog.add(i);
				continue;
			} 
			//次が岩
			String nextPosition = strArray[i];
			if(!nextPosition.equals(stone)){
				i++;
				rootLog.add(i);
				continue;
			} 
			isSuccess =false;
			break;
		}

		if(isSuccess){
			for(int i=a;i<c-1;i++){
				String curPosition = strArray[i-1];
				if(!curPosition.equals(stone)){
					continue;
				} 
				//次が岩
				String nextPosition = strArray[i];
				if(!nextPosition.equals(stone)){
					i++;
					continue;
				} 
				isSuccess =false;
				break;
			}
		}

		if(d>c){
			System.out.println(isSuccess ? "Yes" : "No");
		} else {
			//またごすことが出来るかだけを最後にチェックする
			boolean isSuccessMatagoshi = false;
			for(int root:rootLog){
				// System.out.println("root "+ root);
				String leftPosition = strArray[root-2];
				String rightPosition = strArray[root];
				// System.out.println("leftPosition "+ leftPosition);
				// System.out.println("rightPosition "+ rightPosition);
				if(!leftPosition.equals(stone) && !rightPosition.equals(stone)){
					isSuccessMatagoshi = true;
				}
			}

			System.out.println(isSuccessMatagoshi ? "Yes" : "No");

		}
		

	}
}
