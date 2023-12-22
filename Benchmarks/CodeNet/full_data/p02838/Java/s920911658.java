
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long input[] = new long[n];
		String[] tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			input[i] = Long.parseLong(tmpArray[i]);
		}
		
		long result = 0;
		
		long[] bits = new long[128];
		long mask = 1;
		
		for(int i = 0; i < 128; i++) {
			int ones = 0;
			for(int j = 0; j < n; j++) {
				if((mask & input[j]) != 0) {
					ones++;
				}
			}
			
			bits[i] += ones * (n - ones);
			int k = 1;
			long mask2 = 2;
			while(bits[i] > 1) {
				if((bits[i] & mask2) != 0) {
					bits[i + k]++;
					bits[i] -= mask2;
				}
				
				k++;
				mask2 <<= 1;
			}
			
			mask <<= 1;
		}
//		for(int i = 40; i >= 0; i--) {
//			System.out.print(bits[i]+" ");
//		}
//		System.out.println();
		for(int i = 0; i < 128 ; i++) {
			result += bits[i] * Math.pow(2, i);
		}
		
		System.out.println(result % 1_000_000_007);
		
	}
}
