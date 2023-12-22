import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++){
			list.add(sc.nextInt());
		}
		int count = 0;

		boolean isAllZero =false;
		for(int i=0;i<101;i++){
			count++;
			boolean flag =false;
			isAllZero =true;
			boolean isAfterSecondZero =false;
			for(int j =0;j<n;j++){
				int height = list.get(j);
				if(height == 0 ){
					if(isAfterSecondZero){
						flag =true;
						// isAfterSecondZero =false;
					}
				}else{
					isAfterSecondZero =true;
					isAllZero =false;
					list.set(j,height-1);
					if(flag){
						count++;
					}
					flag =false;
				}
				// System.out.print("j"+j);
				// System.out.print(" height"+height);
				// System.out.println(" count"+count);
			}
			if(isAllZero){
				break;
			}
			// if(i >50){
			// 	System.out.print(i + " ");
			// 	System.out.print(count);
			// 	System.out.println(" end oneLine");

			// }

		}
		System.out.println(count-1);

	}
}

