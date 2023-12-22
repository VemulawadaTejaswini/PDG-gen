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
		
		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
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
		
		long rightSum = 0;
		for(int i = mid; i < right; i++){
			rightSum += input[i];
			
			long leftSum = 0;
			for(int j = mid - 1; j >= left; j--){
				leftSum += input[j];
				
				if(rightSum + leftSum == 0){
					result++;
//					System.out.println("from "+j+" to "+i);
				}
			}
			
//			System.out.println(rightSum);
		}
		
		return result;
	}

}

