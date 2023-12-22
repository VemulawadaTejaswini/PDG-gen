import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] inputArr = sc.nextLine().split(" ");
		long a = Long.parseLong(inputArr[0]);
		long b = Long.parseLong(inputArr[1]);
		sc.close();
		
		ArrayDeque<Long> divisorAList = new ArrayDeque<>();
		ArrayDeque<Long> divisorBList = new ArrayDeque<>();
		
		
		long dividedValue = a;
		for(long i = 2; i < a/2 && i <= dividedValue; i++) {
			if(dividedValue % i == 0) {
				divisorAList.add(new Long(i));
				while(dividedValue % i == 0) {
					dividedValue /= i;
				}
			}
		}
		
		dividedValue = b;
		for(long i = 2; i < b/2 && i <= dividedValue; i++) {
			if(dividedValue % i == 0) {
				divisorBList.add(new Long(i));
				while(dividedValue % i == 0) {
					dividedValue /= i;
				}
			}
		}
		
		int count = 1;// 1は絶対含む
		ArrayDeque<Long> smallValQueue = null;
		ArrayDeque<Long> bigValQueue = null;
		if(divisorAList.peek() < divisorBList.peek()) {
			smallValQueue = divisorAList;
			bigValQueue = divisorBList;
		}else {
			smallValQueue = divisorBList;
			bigValQueue = divisorAList;
		}
		
		while(!smallValQueue.isEmpty() && !bigValQueue.isEmpty()) {
			long smallValue = smallValQueue.pop();
			while(smallValue > bigValQueue.peek()) {
				long bigValue = bigValQueue.pop();
				if(smallValue == bigValue) {
					count++;
					break;
				}
			}
			if(divisorAList.peek() < divisorBList.peek()) {
				smallValQueue = divisorAList;
				bigValQueue = divisorBList;
			}else {
				smallValQueue = divisorBList;
				bigValQueue = divisorAList;
			}
		}
		
		System.out.println(count);
	}

}
