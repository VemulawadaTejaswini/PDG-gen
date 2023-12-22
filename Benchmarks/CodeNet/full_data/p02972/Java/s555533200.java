package abc134;

import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		ArrayList<Integer> ans = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			int sum = 0;
			for(int j = i * 2; j <= n; j += i)
				sum = (sum + a[j - 1]) % 2;
			if(a[i - 1] != sum)
				ans.add(i);
		}
		
		System.out.println(ans.size());
		for(int i = 0; i < ans.size(); i++)
			System.out.print(ans.get(i) + (i == ans.size() - 1 ? "\n" : " "));
	}
}
