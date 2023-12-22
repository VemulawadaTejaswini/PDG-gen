/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] input = new int[n];
		int[] result = new int[n];
		int even = 0;
		int odd = 0;
		boolean sign = true;	//正=true, 負=false
		
		for(int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
			if(i % 2 == 0) {
				even += input[i];
			} else {
				odd += input[i];
			}
		}
		
		if(even > 0 && odd < 0) {	//正負
			sign = true;
			
		} else if(even < 0 && odd > 0) {	//負正
			sign = false;
			
		} else if(even > 0 && odd > 0) {		//正正
			if(even > odd) {
				sign = true;
			} else {
				sign = false;
			}
			
		} else if(even < 0 && odd < 0) {	//負負
			if(even > odd) {
				sign = false;
			} else {
				sign = true;
			}
			
		} else if(even == 0) {
			if(odd < 0) {
				sign = true;
			} else {
				sign = false;
			}
			
		} else if(odd == 0){
			if(even > 0) {
				sign = true;
			} else {
				sign = false;
			}
		}
		//System.out.println(Arrays.toString(input));
		//System.out.println(sign + "");
		//System.out.println(counting(input, result, 0, 0, sign));
		counting(input, result, 0, 0, sign);
	}
	
	public static void counting(int[] input, int[] result, int count, int index, boolean sign) {
		if(index > 0) {
			result[index] = result[index - 1] + input[index];
		} else {
			result[index] = input[index];
		}
		
		if(sign) {
			while(result[index] <= 0) {
				result[index]++;
				count++;
			}
			sign = false;
			
		} else {
			while(result[index] >= 0) {
				result[index]--;
				count++;
			}
			sign = true;
		}
		
		if(index < result.length - 1) {
			counting(input, result, count, index+1, sign);
		} else {
			System.out.println(count);
		}
	}
}