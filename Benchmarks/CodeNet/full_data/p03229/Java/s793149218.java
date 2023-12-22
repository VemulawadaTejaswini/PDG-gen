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
		Collections.sort(list);
		
		int result = 0;

		int firstValue = list.get(0);
		int leftValue = firstValue;
		int rightValue =firstValue;
		int upperCount =n-1;
		int lowerCount =1;
		

		for(int i=0;i<n-1;i++){
			switch (i%4) {
				case 0:
					int thisValue = list.get(upperCount);
					result += Math.abs(leftValue-thisValue);
					// System.out.println(result);
		
					leftValue = thisValue;
					upperCount--;
					
					// System.out.println("left is "+leftValue);
					break;
			
				case 1:
					int oneValue = list.get(upperCount);
					result += Math.abs(rightValue-oneValue);
					// System.out.println(result);
					rightValue = oneValue;
					upperCount--;
					
					// System.out.println("right is "+rightValue);
					break;
				case 2:
					int twoValue = list.get(lowerCount);
					result += Math.abs(leftValue-twoValue);
					// System.out.println(result);
					leftValue = twoValue;
					lowerCount++;
					// System.out.println("left is "+leftValue);
					break;
				case 3:
					int threeValue = list.get(lowerCount);
					result += Math.abs(rightValue-threeValue);
					// System.out.println(result);
					rightValue = threeValue;
					lowerCount++;
					// System.out.println("right is "+rightValue);
					break;
				default:
				// System.out.println("omg");

					break;
			}
		}
		System.out.println(result);


	}

}