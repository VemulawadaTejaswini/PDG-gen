import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public  class Codechef {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int [n];
		for(int i=0; i<arr.length; i++) {
			arr [i] = sc.nextInt();
		}
		int ans [] = new int [n];
		for(int i=0; i<arr.length; i++) {
			ans[arr[i]-1] = i+1;
			
		}
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
}