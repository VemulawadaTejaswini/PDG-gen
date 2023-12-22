import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String str = sc.next();
		String[] strArray = str.split("");
		int[] intArray = new int[strArray.length];
		Map<Integer, Integer> numMap = new HashMap<>();
		int count = 0;
		boolean flag =true;
		int preCount = 0;

		for (int i = 0; i <strArray.length; i++) {
			// intArray[i]=strArray[i].equals("B")?1:0;
			int value = strArray[i].equals("B")?1:0;
			numMap.put(i,value);
			// System.out.println(intArray[i]);
		}

			for (int i = 0; i <numMap.size()-1; i++) {
				// System.out.print(intArray[i] + "+"+intArray[i+1]);
				// System.out.print(intArray[i]==1);
				// System.out.println(intArray[i+1]==0 );
				if(numMap.get(i)==1 && numMap.get(i+1)==0){
					numMap.put(i,0);
					numMap.put(i+1,1);
					count ++;
					i -=2;
					if(i==-2){
						i=0;
					} 
				}
			}
		System.out.println(count);




	}
}