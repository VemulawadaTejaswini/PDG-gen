import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		int n = Integer.parseInt(str);
		String strA = input.readLine( );
		String strB = input.readLine( );
		String[] arrayStrA = strA.split(" ");
		String[] arrayStrB = strB.split(" ");

		long[] arrayA = new long[n];
		long[] arrayB = new long[n];
		long[] diff = new long[n];
		long sum = 0;
		long count = 0;

		for(int i=0; i<n; i++) {
			arrayA[i] = Long.parseLong(arrayStrA[i]);
			arrayB[i] = Long.parseLong(arrayStrB[i]);
			if(arrayA[i] < arrayB[i]) {
				count++;
			}
			diff[i] = arrayA[i] - arrayB[i];

			sum += diff[i];
		}

		int left = 0;
		int right = 1;

		if(count == 0) {
			System.out.println(0);
		}else if(sum < 0) {
			System.out.println(-1);
		}else {
			Arrays.sort(diff);

			while(diff[left] < 0) {
				if(diff[left] + diff[n-right] >=0) {
					diff[n-right] += diff[left];
					diff[left] = 0;
					left++;
				}else {
					diff[0] += diff[n-1];
					diff[n-1] = 0;
					right++;
				}
			}
			System.out.println(left+right);
		}

	}

}
