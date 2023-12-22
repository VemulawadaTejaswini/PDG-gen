import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		int arr[]= new int[n];
		for(int i=0;i<n;i++){
			arr[i] = scan.nextInt();
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i])+1);
			}
			else{
				map.put(arr[i],1);
			}
		}
		int count=0;
		for(int i=0;i<n;i++){
			if(!map.containsKey(arr[i])){
				continue;
			}
			if(map.get(arr[i])>arr[i]){
				count += map.get(arr[i])%arr[i];
			}
			else if(map.get(arr[i])<arr[i]){
				count+=map.get(arr[i]);
			}
			map.remove(arr[i]);
		}
		System.out.println(count);
	}
}
