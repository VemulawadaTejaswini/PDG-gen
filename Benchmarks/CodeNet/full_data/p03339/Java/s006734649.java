import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		String s = scn.next();
		int[] left=new int[n];
		int[] right=new int[n];
		int e = 0, w = 0;
		for(int i=0;i<n;i++){
			char ch = s.charAt(i);
			left[i]+=w;
			if(ch=='E'){
				e++;
			}else{
				w++;
			}
		}
		w=0;e=0;
		for(int i=n-1;i>=0;i--){
			char ch = s.charAt(i);
			right[i]+=e;
			if(ch=='E'){
				e++;
			}else{
				w++;
			}
		}
		int min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			int sum = left[i] + right[i];
			min = Math.min(sum, min);
		}
		System.out.println(min);	
	}
}