import java.util.*;
import java.math.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr= new int[n];
		for(int qq=1; qq<n; qq++){
			arr[qq] = in.nextInt();
		}
		HashMap<Integer, Integer> mp = new HashMap<>();
		for(int i=0; i<n; i++){
			mp.put(arr[i]-1, 1+mp.getOrDefault(arr[i]-1, 0));
		}
		for(int i=0; i<n; i++){
			System.out.println(mp.getOrDefault(i, 0));
		}
	}
}