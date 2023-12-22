import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Map<Integer , Map<Integer, Integer>> memoMap = new HashMap<>(3);
	static int[][] array;
	static int length;
	static int[][] minMax = new int[3][2];

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		length = Integer.parseInt(sc.nextLine());
		array = new int[3][length];
		memoMap.put(0, new HashMap<Integer,Integer>(length));
		memoMap.put(1, new HashMap<Integer,Integer>(length));
		String[][] sArray = {
				sc.nextLine().split(" "),
				sc.nextLine().split(" "),
				sc.nextLine().split(" ")
		};
		for(int i =2; i > -1; i--){
			array[i] = parse(i, sArray[i]);
		}



		int sum = 0;
		for(int i = 0; i < length; i++){
			sum += count(0,i);
		}

		System.out.println(sum);
	}


	private static int count(int arrayNum, int num){
		int number = array[arrayNum][num];
		Map<Integer, Integer> map = memoMap.get(arrayNum);
		if(map.containsKey(number)) {
			return map.get(number);
		}


		int count = 0;
		int nextArrayNum = arrayNum+1;
		for(int i =0; i < length;i++){
			int nextNum = array[nextArrayNum][i];
			if(number < nextNum) count += arrayNum == 0 ? count(nextArrayNum, i) : 1;
		}
		map.put(number, count);
		return count;
	}



	private static int[] parse(int arrayNum, String[] sArray){
		int[] iArray = new int[length];

		for(int i =0; i < length;i++){
			int n = Integer.parseInt(sArray[i]);
			if(minMax[arrayNum][0] > n || minMax[arrayNum][0] == 0) minMax[arrayNum][0] = n;
			if(minMax[arrayNum][1] < n) minMax[arrayNum][1] = n;
			if(arrayNum == 1){
				if(minMax[arrayNum+1][0] > n){
					memoMap.get(arrayNum).put(n, length);
				}
				if(minMax[arrayNum+1][1] <= n) memoMap.get(arrayNum).put(n, 0);
			}else if(arrayNum == 0){
				if(minMax[arrayNum+1][1] <= n) memoMap.get(arrayNum).put(n, 0);

			}
			iArray[i] = Integer.parseInt(sArray[i]);
		}

		return iArray;
	}
}