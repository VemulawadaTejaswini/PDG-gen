import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] tmpArray = br.readLine().split(" ");

		int input[] = new int[n];
		long fixed[] = new long[n];

		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
			fixed[i] = input[i] - (i + 1);
		}

		//debug
//		for(int i = 0; i < n; i++){
//			System.out.print(fixed[i] + " ");
//		}
//		System.out.println();

//		Arrays.sort(fixed);
		//平均を求める
		double ave = 0;
		long sum = 0;
		for(int i = 0; i < n; i++){
			ave += fixed[i];
			sum += fixed[i];
		}
//		ave /= n;
		ave = sum/n;

//		System.out.println(ave);
		long d1 = -(long)Math.ceil(ave);
//		long d2 = -(long)Math.floor(ave);
		long d2 = d1 + 1;
//		long d3 = -((long)Math.ceil(ave) + 1);
		long d3 = d1 - 1;
//		System.out.println(d1+ " " + d2 + " "+ d3);

		long result1 = 0;
		long result2 = 0;
		long result3 = 0;

		for(int i = 0; i < n; i++){
			result1 += Math.abs(fixed[i] + d1);
			result2 += Math.abs(fixed[i] + d2);
			result3 += Math.abs(fixed[i]);
		}

		System.out.println(Math.min(result3, Math.min(result1, result2)));

//		//最悪解
//		long result = Long.MAX_VALUE;
//		for(int b = -100 + (int)d1; b < 100 + d1 ; b++){
//			long tmpResult = 0;
//			for(int i = 0; i < n; i++){
//				tmpResult += Math.abs(fixed[i] + b);
//			}
//
//			result = Math.min(tmpResult, result);
//		}
//
//		System.out.println(result);
	}

}
