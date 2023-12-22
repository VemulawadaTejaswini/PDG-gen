import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class Main {
	static HashMap<String, Integer> map = new HashMap<String, Integer>();

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] s = new int [n];
		for(int i = 0; i < n; i++){
			s[i] = Integer.parseInt(br.readLine());
		}
		int max = solve(s,n);
		System.out.println(max);
	}

	static int solve(int[] s, int n){
		int sum = 0;
		int[] tmp = new int[n];
		for(int i = 0; i < n; i++){
			sum += s[i];
			tmp[i] = s[i];
		}
		if(sum == 0)
			return 0;
		if(sum%10==0)
			sum = 0;

		int max = sum;
		for(int i = 0; i < n; i++){
			if(tmp[i]==0)
				continue;
			sum += tmp[i];
			int num = tmp[i];
			tmp[i] = 0;
			
			int comp = solve(tmp,n);
			if(comp%10==0)
				comp = 0;
			max = Math.max(max,comp);
			tmp[i] = num;
		}
		return max;
	}
}