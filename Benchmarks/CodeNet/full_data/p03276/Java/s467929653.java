import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmpArray = br.readLine().split(" ");

		int n = Integer.parseInt(tmpArray[0]);
		int k = Integer.parseInt(tmpArray[1]);

		int input[] = new int[n];
		tmpArray = br.readLine().split(" ");

		int firstPositiveIndex = -1;
		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(tmpArray[i]);

			if(firstPositiveIndex < 0 && input[i] >= 0){
				firstPositiveIndex = i;
			}
		}

		int posSum[] = new int[n];
		int negSum[] = new int[n];

		if(input[0] >= 0){
			posSum[0] = input[0];
		}
		if(input[n - 1] < 0){
			negSum[n - 1] = input[n - 1];
		}
		for(int i = 1 ; i < n; i++){
			if(input[i] >= 0){
				posSum[i] = posSum[i - 1] + input[i];
			}

			if(input[n - i - 1] < 0){
				negSum[n - i - 1] = negSum[n - i] + input[n - i - 1];
			}
		}

		//debug
//		for(int i = 0; i < n; i++){
//			System.out.println(posSum[i] +" "+negSum[i]);
//		}

		long result = Long.MAX_VALUE;
		for(int i = 0; i + k <= n; i++){
//			int pos = posSum[i + k - 1];
//			int neg = negSum[i];
			int pos = Math.max(input[i + k - 1] , 0);
			int neg = Math.min(0, input[i]);
//			System.out.println("pos neg "+pos+" "+neg);

			long tmpCost = 0;
			if(pos >= -neg){
				tmpCost = (-neg)*2 + pos;
			}
			else {
				tmpCost = (-neg) + pos*2;
			}

//			System.out.println("cost "+tmpCost );
			result = Math.min(result, tmpCost);
		}

		System.out.println(result);
	}

}
