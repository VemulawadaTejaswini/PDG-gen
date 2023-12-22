import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.solove();
	}
	
	public void solove() {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int sumOfA = 0;
		
		int[] aArr = new int[n];
		for(int i = 0 ; i < n;i++) {
			int nextInt = sc.nextInt();
			aArr[i] = nextInt;
			sumOfA += nextInt;
		}
		
		sc.close();
		
		ArrayList<Integer> divisorArr = new ArrayList<>();
		for(int i = 1 ; i < sumOfA ; i++) {
			if(sumOfA % i == 0) {
				divisorArr.add(new Integer(i));
				if(i * i > sumOfA) {
					divisorArr.add(new Integer(sumOfA));
					break;
				}
			}
		}
		
		for(int i = divisorArr.size() - 1; i >= 0 ; i--) {
			if(canDivide(aArr, divisorArr.get(i), k)) {
				System.out.println(divisorArr.get(i));
				return;
			}
		}
	}
	
	public boolean canDivide(int[] aArr, int divideValue, int k) {
		
		int sumOfR = 0;
		boolean hasZero = false;
		ArrayList<Integer> rList = new ArrayList<>();
		for(int i = 0; i < aArr.length; i++) {
			if(aArr[i] % divideValue != 0) {
				rList.add(aArr[i] % divideValue);
				sumOfR += aArr[i] % divideValue;
			}else {
				hasZero = true;
			}
		}
		
		if(sumOfR % divideValue != 0) {
			return false;
		}
		
		if(sumOfR == 0 || (hasZero && (sumOfR % divideValue == 0 || (divideValue * rList.size() - sumOfR) % divideValue == 0 ))) {
			return true;
		}
		
		Collections.sort(rList);
		
		int cumSum = 0;
		for(int i = 0; i < rList.size() - 1; i++) {
			cumSum += rList.get(i);
			int plusSum = divideValue * (rList.size() - i - 1) -  (sumOfR - cumSum);
			
			if(cumSum < plusSum) {
				if((plusSum - cumSum)%divideValue == 0 && plusSum <= k) {
					return true;
				}
			}
			if(plusSum < cumSum) {
				if((cumSum - plusSum)%divideValue == 0 && cumSum <= k) {
					return true;
				}
			}
			
			if(plusSum - cumSum == 0 && cumSum <= k && plusSum <= k) {
				return true;
			}
		}
		
		return false;		
	}
}
