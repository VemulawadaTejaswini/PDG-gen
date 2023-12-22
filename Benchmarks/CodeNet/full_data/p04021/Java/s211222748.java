import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) {
		long result = 0;
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		List<Long> tmpList = new ArrayList<Long>();
		List<Long> sortedList = new ArrayList<Long>();
		for(int i=0;i<input;i++){
			long tmpInput = sc.nextLong();
			tmpList.add(tmpInput);
			sortedList.add(tmpInput);
		}
		Collections.sort(sortedList);
		for(Long sortedNum : sortedList){
			int sortedIndex = sortedList.indexOf(sortedNum);
			int tmpIndex = tmpList.indexOf(sortedNum);
			
			int distance = tmpIndex - sortedIndex;
			int countSousa2 = distance/3;
			for(int i=0;i<countSousa2;i++){
				sousa2(tmpList, sortedNum);
			}
			if(distance % 2 ==1){
				sousa1(tmpList, sortedNum);
				result +=1;
			}
			
			
		}
		
		System.out.print(result);
	}
	
	public static void sousa1(List<Long> tmpList, Long num){
		int indexOfNum = tmpList.indexOf(num);
		Long pairNum = tmpList.get(indexOfNum -1);
		tmpList.set(indexOfNum - 1, num);
		tmpList.set(indexOfNum, pairNum);
	}

	public static void sousa2(List<Long> tmpList, Long num){
		int indexOfNum = tmpList.indexOf(num);
		Long pairNum = tmpList.get(indexOfNum -2);
		tmpList.set(indexOfNum - 2, num);
		tmpList.set(indexOfNum, pairNum);
	}
	
}