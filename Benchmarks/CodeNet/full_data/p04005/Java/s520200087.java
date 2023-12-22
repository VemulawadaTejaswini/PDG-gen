import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		List<Long> numList = new ArrayList<Long>();
		Scanner sc = new Scanner(System.in);
		numList.add(sc.nextLong());
		numList.add(sc.nextLong());
		numList.add(sc.nextLong());
		sc.close();
		long result = 0;
		boolean isAllEven = true;
		for(Long num : numList){
			
			if(!isEven(num)){
				isAllEven = false;
				break;
			}
		}
		
		if (isAllEven){
			
			result = 0;
		}
		else{
			
			Collections.sort(numList);
			result = numList.get(0) * numList.get(1);
		}
		
		System.out.println(result);
	}

	public static boolean isEven(long num){
		boolean result = false;
		
		if(num % 2 == 0){
			
			result = true;
		}
		
		return result;
	}
}
