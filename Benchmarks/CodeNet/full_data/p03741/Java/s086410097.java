import java.util.*;


public class Main {
	
	public static void main (String[] args){
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int[] array = new int[N];
		for(int i=0;i<N;i++){
			array[i] = cin.nextInt();
		}
		int res1 = 0;//这种情况是 正负 正负的序列来的
		int res2 = 0;//这种情况是 负正 负正的序列来的
		int sum1 = 0;
		int sum2 = 0;
		if (array[0] == 0) {
			res1 = 1;
			sum1 = 1;
			res2 = 1;
			sum2 = -1;
		} else if (array[0] > 0) {
			res2 += Math.abs(-1-array[0]);
			sum2 = -1;
		} else {
			res1 += Math.abs(1-array[0]);
			sum1 = 1;
		}
		for (int i=1;i<N;i++){
			int temp = sum1 + array[i];
			if (temp * sum1 == 0){
				if (sum1 > 0) {
					//temp
					array[i]--;
				} else {
					array[i]++;
				}
				res1++;
			} else if (temp * sum1 > 0) {
				if (sum1 > 0) {
					 //要令temp = -1才行
					res1+=Math.abs(-1 - sum1 - array[i]);
					sum1 = -1;
				} else {
					res1+= Math.abs(1-sum1 -array[i]);
					sum1 = 1;
				}
			} else {
				sum1 = temp;
			}
			
			temp = sum2 + array[i];
			if (temp * sum2 == 0){
				if (sum2 > 0) {
					//temp
					array[i]--;
				} else {
					array[i]++;
				}
				res2++;
			} else if (temp * sum2 > 0) {
				if (sum2 > 0) {
					 //要令temp = -1才行
					res2+=Math.abs(-1 - sum2 - array[i]);
					sum2 = -1;
				} else {
					res2+= Math.abs(1-sum2 -array[i]);
					sum2 = 1;
				}
			} else {
				sum2 = temp;
			}
		}
		System.out.println(Math.min(res1, res2));
	}
}