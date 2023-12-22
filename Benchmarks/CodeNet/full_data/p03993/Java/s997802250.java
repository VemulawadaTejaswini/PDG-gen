import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arrstring = br.readLine().split(" ");
		int[] arr = new int[n];
		
		for(int i =0 ;i<n;i++){
			arr[i] = Integer.parseInt(arrstring[i]);
		}
		int counter = 0;
		for(int i =0; i<arr.length;i++){
			if(arr[arr[i]-1]==i+1)counter++;
		}
		System.out.println(counter/2);//
	}
}