import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < n; i++){
			nums[i] = sc.nextInt();
		}
		int[] sums = new int[n];
		int tempSum = 0;
		for(int i = 0; i < n; i++){
			tempSum = nums[i] + tempSum;
			sums[i] = tempSum;
		}
		int result = 0;
		
		for(int i = 1; i < n; i++){
			boolean flag = check(sums) == false;
			if(flag){
				if(sums[i] * sums[i - 1] >= 0){
					if(sums[i - 1] > 0){
						result += Math.abs(-1 - sums[i]);
						int temp = (-1 - sums[i]);
						for(int j = i; j < n; j++){
							sums[j] += temp;
						}
						temp = 0;
					}
					else if(sums[i - 1] < 0){
						result += Math.abs(1 - sums[i]);
						int temp = (1 - sums[i]);
						for(int j = i; j < n; j++){
							sums[j] += temp;
						}
						temp = 0;
					}
				}
			}
			else{
				break;
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}

	public static boolean check(int[] sums){
		for(int i = 0; i < sums.length; i++){
			if(sums[i] == 0)
				return false;
			else if(i >= 1 && sums[i] * sums[i - 1] >= 0)
				return false;
		}
		return true;
	}
}