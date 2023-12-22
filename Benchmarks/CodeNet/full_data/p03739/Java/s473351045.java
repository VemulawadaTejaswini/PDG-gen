import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
	//ABC059
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] a = new int[n];
		int[] sum = new int[n];
		int ans = 0;
		
		for(int i = 0; i < n; i++){
			a[i] = in.nextInt();
			if(i == 0) sum[0] = a[0];
			else sum[i] = sum[i-1] + a[i];
		}
		
		/*
		for(int j = 0; j < n; j++) System.out.print(sum[j] + " ");
		System.out.println();
		*/
		
		if(sum[0] == 0){
			if(sum[1] > 0){
				for(int i = 0; i < n; i++) sum[i]--;
				ans++;
			}else{
				for(int i = 0; i < n; i++) sum[i]++;
				ans++;
			}
		}
		
		int diff_0 = 0;
		for(int i = 1; i < n; i++){
			sum[i] += diff_0;
			if(sum[i] == 0){
				if(sum[i-1] < 0){
					sum[i]++;
					diff_0++;
					ans++;
				}else{
					sum[i]--;
					diff_0--;
					ans++;
				}
			}
		}
		
		/*
		for(int j = 0; j < n; j++) System.out.print(sum[j] + " ");
		System.out.println();
		*/
		
		int diff = 0;
		for(int i = 1; i < n; i++){
			sum[i] += diff;
			/*
			System.out.print(i + ":");
			for(int j = 0; j < n; j++) System.out.print(sum[j] + " ");
			System.out.println();
			*/
			if(sum[i-1] < 0 && sum[i] <= 0){
				int d = - sum[i] + 1;
				sum[i] += d;
				diff += d;
				ans += Math.abs(d);
			}else if(sum[i-1] > 0 && sum[i] >= 0){
				int d = - sum[i] - 1;
				sum[i] += d;
				diff += d;
				ans += Math.abs(d);
			}
		}
		
		/*
		System.out.println();
		for(int i = 0; i < n; i++) System.out.print(sum[i] + " ");
		System.out.println();
		*/
		System.out.println(ans);
	}
}