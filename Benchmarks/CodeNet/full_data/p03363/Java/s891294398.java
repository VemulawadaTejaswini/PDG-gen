import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] tmpArray = br.readLine().split(" ");
		int input[] = new int[n];
		
		int negative = 0;
		int positive = 0;
		
		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
			if(input[i] > 0){
				positive++;
			}
			else if(input[i] < 0){
				negative++;
			}
		}
		
		if((positive > 0 && negative == 0) || (positive == 0 && negative > 0)){
			System.out.println("0");
			return;
		}
		else if(positive == 0 && negative == 0){
			System.out.println((long)n*(n+1)/2);
			return;
		}
		
		long result = 0;
		
//		for(int i = 0; i < n; i++){
//			long tmp = 0;
//			for(int j = i; j < n; j++){
//				tmp += input[j];
//				
////				System.out.print(tmp +" ");
//				if(tmp == 0){
//					result++;
//				}
//			}
//		}
		
//		System.out.println(result);
		System.out.println(solve(input, 0, n));
	}
	
	static long solve(int[] input, int left, int right){
//		System.out.println("left "+left+" right "+right);
		if(right - left <= 1){
			if(input[left] == 0){
				return 1;
			}
			else {
				return 0;
			}
		}
		
		int mid = (left+right)/2;
		
		long result = 0;
		
//		System.out.println("left "+left+" right "+right+ " mid "+mid);
		
		result += solve(input, left, mid);
		result += solve(input, mid, right);
		
//		long rightSum = 0;
		long[] rightSum = new long[right - mid];
		long[] leftSum = new long[mid - left];
		
		long tmpSum = 0;
		for(int i = mid; i < right ; i++){
			tmpSum += input[i];
			
			rightSum[i - mid] = tmpSum;
		}

		tmpSum = 0;
		for(int i = mid - 1; i >= left ; i--){
			tmpSum += input[i];
			
			leftSum[mid - 1 - i] = tmpSum;
		}
		
//		Arrays.sort(leftSum);
		//debug
//		for(int i = 0; i < leftSum.length ; i++){
////			System.out.print(leftSum[i]);
//		}
//		System.out.println();
		Arrays.sort(rightSum);
		
		for(int i = 0; i < leftSum.length ; i++){
			int index = Arrays.binarySearch(rightSum, -leftSum[i]);
			
			if(index >= 0){
				result++;
//				System.out.println("left "+left+" right "+right+" mid "+mid+ "hit "+leftSum[i]);
				
				for(int j = index - 1; j >= 0; j--){
					if(rightSum[j] != -leftSum[i]){
						break;
					}
					result++;
				}
				
				for(int j = index + 1; j < rightSum.length; j++){
					if(rightSum[j] != -leftSum[i]){
						break;
					}
					result++;
				}
			}
		}
		
		
		return result;
	}

}

