import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = scn.nextInt();
		}
      	int[] mem = new int[arr.length];
      	Arrays.fill(mem,-1);
		int ans = solution(0,arr,mem);
        System.out.println(ans);
	}
	
	public static int solution(int idx,int[] arr,int[] mem){
	    if(idx==arr.length-1)return mem[idx]=0;
      	if(mem[idx]!=-1)return mem[idx];
	    int o1 = idx+1<arr.length?solution(idx+1,arr,mem)+Math.abs(arr[idx+1]-arr[idx]):1000000;
	    int o2 = idx+2<arr.length?solution(idx+2,arr,mem)+Math.abs(arr[idx+2]-arr[idx]):1000000;
	    return mem[idx]=Math.min(o1,o2);
	}
}
