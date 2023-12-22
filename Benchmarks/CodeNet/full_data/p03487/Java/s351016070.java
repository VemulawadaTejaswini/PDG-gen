import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);	
			
			int n = sc.nextInt();
			int[] mem = new int[n];
			int[] ar = new int[100005];
			int ans = 0;
			for (int i = 0; i < n; i++) {
				mem[i] = sc.nextInt();
				if(mem[i] > 100000){
					mem[i] = 0;
				}
			}
			for (int i = 0; i < n; i++) {
				ar[mem[i]]++;
			}
			for (int i = 1; i < 100005; i++) {
				if (ar[i] > i) {
					ans += (ar[i]-i);
				}else if(ar[i] == i){
					continue;
				}else{
					ans += ar[i];
				}	
			}
			System.out.println(ans);

		    sc.close(); }

	public static boolean isEven(int n ) {
		if (n % 2 == 0) {
			return true;
		}else{
			return false;
		}
	}
}