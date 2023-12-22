import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import javax.swing.ScrollPaneConstants;

import org.omg.Messaging.SyncScopeHelper;

public class Solution {
static	Scanner input = new Scanner(System.in);


	public static void main(String[] args) {
		int n = input.nextInt();
		int[] a  = new int [n];
		
		for (int i = 0 ; i < n ; i++) 
			a[i] = input.nextInt();
		
		int [] freq = new int [100000];
		
		for (int i = 0 ; i < n ; i++) {
			freq[a[i]]++;
		}
		
		Arrays.sort(freq);
		int sum = 0;
		int unique = 0 ;
		
		for (int i = 100000-1; i >= 0 ; i--) {
			if (freq[i]==0) {
				break;
			}
			unique++;
			
			sum+=(freq[i]-1);

			
			
		}
		if (sum%2==1) {
			unique-=1;
		}
		System.out.println(unique);
		
		
		
		
		
		
		
	
		
	}
}

