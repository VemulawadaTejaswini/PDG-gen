import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int sum;
		int[] cnt = new int[n];
		sum = Integer.parseInt(str[0]);
		cnt[0] = sum;
		for(int i = 1; i < n; i++){
			sum += Integer.parseInt(str[i]);
			cnt[i] = sum;
		}
		int min = Integer.MAX_VALUE;
		for(int i = 1; i < n-1; i++){
			int a = Math.abs(sum-cnt[i]*2);
			if(a < min)
				min = a;
		}
		System.out.println(min);
	}
}