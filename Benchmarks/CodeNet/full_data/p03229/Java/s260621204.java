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
		boolean preIsLeft =true;
		// System.out.println(list);
		

		for(int i=0;i<n-1;i++){
			switch (i%4) {
				case 0:
				int thisValue = list.get(upperCount);
				if(upperCount-lowerCount==0){
					if(Math.abs(leftValue-thisValue)>Math.abs(rightValue-thisValue)){
						result += Math.abs(leftValue-thisValue);
						leftValue = thisValue;
						
						upperCount--;
						preIsLeft =true;
					}else if(Math.abs(leftValue-thisValue)<Math.abs(rightValue-thisValue)){
						result += Math.abs(rightValue-thisValue);
						rightValue = thisValue;
						upperCount--;
						preIsLeft =false;
					}else{
						if(preIsLeft){
							result += Math.abs(rightValue-thisValue);
							rightValue = thisValue;
							upperCount--;
							preIsLeft =false;
						}else{
							result += Math.abs(rightValue-thisValue);
							rightValue = thisValue;
							upperCount--;
							preIsLeft =true;
						}
					}
					// System.out.println("left"+leftValue);
					// System.out.println("right"+rightValue);
					// System.out.println("result"+result);
					// System.out.println("thisValue"+thisValue);
					// System.out.println("preIsLeft"+preIsLeft);
					// System.out.println(" ");
					break;
				}

				result += Math.abs(leftValue-thisValue);
				leftValue = thisValue;
				upperCount--;
				preIsLeft =true;
				
				// System.out.println("left"+leftValue);
				// System.out.println("right"+rightValue);
				// System.out.println("result"+result);
				// System.out.println("thisValue"+thisValue);
				// System.out.println("preIsLeft"+preIsLeft);
				// System.out.println(" ");

				break;


				case 1:
					int oneValue = list.get(upperCount);
					if(upperCount-lowerCount==0){
						if(Math.abs(leftValue-oneValue)>Math.abs(rightValue-oneValue)){
							result += Math.abs(leftValue-oneValue);
							leftValue = oneValue;
							
							upperCount--;
							preIsLeft =true;
						}else if(Math.abs(leftValue-oneValue)<Math.abs(rightValue-oneValue)){
							result += Math.abs(rightValue-oneValue);
							rightValue = oneValue;
							upperCount--;
							preIsLeft =false;
						}else{
							if(preIsLeft){
								result += Math.abs(rightValue-oneValue);
								rightValue = oneValue;
								upperCount--;
								preIsLeft =false;
							}else{
								result += Math.abs(rightValue-oneValue);
								rightValue = oneValue;
								upperCount--;
								preIsLeft =true;
							}
						}
						// System.out.println("left"+leftValue);
						// System.out.println("right"+rightValue);
						// System.out.println("result"+result);
						// System.out.println("oneValue"+oneValue);
						// System.out.println("preIsLeft"+preIsLeft);
						// System.out.println(" ");
						break;
					}

					result += Math.abs(rightValue-oneValue);
					rightValue = oneValue;
					upperCount--;
					preIsLeft =false;
					
					// System.out.println("left"+leftValue);
					// System.out.println("right"+rightValue);
					// System.out.println("result"+result);
					// System.out.println("oneValue"+oneValue);
					// System.out.println("preIsLeft"+preIsLeft);
					// System.out.println(" ");

					break;
				case 2:
				int twoValue = list.get(lowerCount);
				if(upperCount-lowerCount==0){
					if(Math.abs(leftValue-twoValue)>Math.abs(rightValue-twoValue)){
						result += Math.abs(leftValue-twoValue);
						leftValue = twoValue;
						lowerCount++;
						preIsLeft =true;

					}else if(Math.abs(leftValue-twoValue)<Math.abs(rightValue-twoValue)){
						result += Math.abs(rightValue-twoValue);
						rightValue = twoValue;
						lowerCount++;
						preIsLeft =false;
					}else{
						if(preIsLeft){
							result += Math.abs(rightValue-twoValue);
							rightValue = twoValue;
							lowerCount++;
							preIsLeft =false;
						}else{
							result += Math.abs(leftValue-twoValue);
							leftValue = twoValue;
							lowerCount++;
							preIsLeft =true;
						}
					}

					// System.out.println("left"+leftValue);
					// System.out.println("right"+rightValue);
					// System.out.println("result"+result);
					// System.out.println("twoValue"+twoValue);
					// System.out.println("preIsLeft"+preIsLeft);
					// System.out.println(" ");
					break;
				}
				result += Math.abs(leftValue-twoValue);
						leftValue = twoValue;
						lowerCount++;
						preIsLeft =true;
						break;

				case 3:
				int threeValue = list.get(lowerCount);
				// System.out.println("threeValue"+threeValue);
				if(upperCount-lowerCount==0){
					// System.out.println("upperCount-lowerCount"+ (upperCount-lowerCount));
					if(Math.abs(leftValue-threeValue)>Math.abs(rightValue-threeValue)){
						result += Math.abs(leftValue-threeValue);
						leftValue = threeValue;
						lowerCount++;
						preIsLeft =true;

					}else if(Math.abs(leftValue-threeValue)<Math.abs(rightValue-threeValue)){
						result += Math.abs(rightValue-threeValue);
						rightValue = threeValue;
						lowerCount++;
						preIsLeft =false;
					}else{
						if(preIsLeft){
							result += Math.abs(rightValue-threeValue);
							rightValue = threeValue;
							lowerCount++;
							preIsLeft =false;
						}else{
							result += Math.abs(leftValue-threeValue);
							leftValue = threeValue;
							lowerCount++;
							preIsLeft =true;
						}
					}

					// System.out.println("left"+leftValue);
					// System.out.println("right"+rightValue);
					// System.out.println("result"+result);
					// System.out.println("threeValue"+threeValue);
					// System.out.println("preIsLeft"+preIsLeft);
					// System.out.println(" ");
					break;
				}
				// System.out.println("upperCount-lowerCount"+ (upperCount-lowerCount));
				result += Math.abs(leftValue-threeValue);
				leftValue = threeValue;
				lowerCount++;
				preIsLeft =true;
				break;

					
				default:
				// System.out.println("omg");
					break;
			}
		}
		System.out.println(result);


	}

}