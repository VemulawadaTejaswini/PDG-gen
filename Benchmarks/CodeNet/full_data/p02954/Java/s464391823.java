import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String str = sc.next();
		String[] strArray = str.split("");

		boolean rightTurn = true;
		int leftCount = 0;
		int rightCount = 0;
		// System.out.println("strArray.length " + strArray.length);
		for (int i = 0; i < strArray.length; i++) {
			String s = strArray[i];
			boolean isRight = s.equals("R");
			// System.out.println("s " + s);

			if(rightTurn && isRight){
				rightCount ++;
			} else if (!rightTurn && !isRight){
				leftCount ++;
			} else if (rightTurn && !isRight) {
				leftCount++;
				rightTurn = false;
			} else {
				rightTurn = true;
				// ここが区切り
				// System.out.println("rightCount " + rightCount);
				// System.out.println("leftCount " + leftCount);

				if((leftCount + rightCount)%2 == 0 ){
					int sum = leftCount + rightCount;
					for (int j = 0; j < rightCount-1; j++) {
						System.out.print("0 ");
					}
					System.out.print((sum/2) + " ");
					System.out.print((sum/2) + " ");
					for (int j = 0; j < leftCount-1; j++) {
						System.out.print("0 ");
					}
				} else {
					// 奇数は面倒
					int sum = leftCount + rightCount;
					for (int j = 0; j < rightCount-1; j++) {
						System.out.print("0 ");
					}
					if(rightCount % 2 == 0){
						int result = sum/2;
						System.out.print(result + " ");
					}else{
						int result = sum/2 +1;
						System.out.print(result + " ");
					}


					if(leftCount % 2 == 0){
						int result = sum/2;
						System.out.print(result + " ");
					}else{
						int result = sum/2 +1;
						System.out.print(result + " ");
					}
					for (int j = 0; j < leftCount-1; j++) {
						System.out.print("0 ");
					}
				}
				leftCount = 0;
				rightCount = 1;
			}
		}


		if((leftCount + rightCount)%2 == 0 ){
			int sum = leftCount + rightCount;
			for (int j = 0; j < rightCount-1; j++) {
				System.out.print("0 ");
			}
			System.out.print((sum/2) + " ");
			System.out.print((sum/2) + " ");
			for (int j = 0; j < leftCount-1; j++) {
				System.out.print("0 ");
			}
		} else {
			// 奇数は面倒
			int sum = leftCount + rightCount;
			for (int j = 0; j < rightCount-1; j++) {
				System.out.print("0 ");
			}
			if(rightCount % 2 == 0){
				int result = sum/2;
				System.out.print(result + " ");
			}else{
				int result = sum/2 +1;
				System.out.print(result + " ");
			}


			if(leftCount % 2 == 0){
				int result = sum/2 +1;
				System.out.print(result + " ");
			}else{
				int result = sum/2;
				System.out.print(result + " ");
			}
			for (int j = 0; j < leftCount-1; j++) {
				System.out.print("0 ");
			}
		}

	}

}
