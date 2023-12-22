import java.lang.*;
importjava.util.*;
class Solution {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int[] count=new int[t+1];
		for (int i=0;i<t;i++) {
			count[sc.nextInt()]++;
		}
		for (int i=1;i<=t ;i++ ) {
			System.out.print(count[i]+" ");
		}
	}
}