

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		Long[] a1 = new Long[n1];
		Long[] a2 = new Long[n2];
		Long[] a3 = new Long[n3];
		
		for(int i = 0; i < n1; i++)
			a1[i] = sc.nextLong();
		for(int i = 0; i < n2; i++)
			a2[i] = sc.nextLong();
		for(int i = 0; i < n3; i++)
			a3[i] = sc.nextLong();
		
		Arrays.sort(a1, Collections.reverseOrder());
		Arrays.sort(a2, Collections.reverseOrder());
		Arrays.sort(a3, Collections.reverseOrder());
		
		Long[] inv = new Long[x+y];
		int invn = 0;
		for(int i = 0; i < x; i++)
		{
			inv[invn] = a1[i];
			invn++;
		}
		for(int i = 0; i < y; i++)
		{
			inv[invn] = a2[i];
			invn++;
		}
		Arrays.sort(inv, Collections.reverseOrder());
		int col = 0;
		invn--;
		while(invn >= 0 && col < n3 && a3[col] > inv[invn])
		{
			inv[invn] = a3[col];
			invn--;
			col++;
		}
		
		long sum = 0;
		for(int i = 0; i < x+y; i++)
			sum += inv[i];
		
		System.out.println(sum);
		
		
	}

}
