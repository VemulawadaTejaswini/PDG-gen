import java.util.*;
public class Main {
	
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int N =  sc.nextInt();
		List<Integer> inputList = new ArrayList<Integer>();
		List<Integer> aliceList = new ArrayList<Integer>();
		List<Integer> bobList = new ArrayList<Integer>();
				
		for (int i = 0; i < N;i++) {
		
			int num = sc.nextInt();
		
			inputList.add(num);
		}
		
		Collections.sort(inputList,Collections.reverseOrder());
		boolean aliceFlg = true;
		
		for (int j = 0 ; j < inputList.size(); j++) {
			
			if (aliceFlg) {
				
				aliceList.add(inputList.get(j));
				aliceFlg = false;
			} else {
				
				bobList.add(inputList.get(j));
				aliceFlg = true;
			}
			
			
		}
		
		int aliceSum = 0;
		
		for (int aliceNum:aliceList) {
			aliceSum += aliceNum;
		}
		
		int bobSum = 0;
		
		for (int bobNum:bobList) {
			bobSum += bobNum;
		}
		
		System.out.println(aliceSum-bobSum);
			
	}	
}