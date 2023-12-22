

import java.util.*;
import java.util.HashMap;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		if(k<=1){
			System.out.println(0);
			System.exit(0);
		}
		
		int[] a=new int[n];
		
		
		int tmp1=0;
		for(int i=0;i<n;i++){
			a[i]=(sc.nextInt()+tmp1-1)%k;
			if(a[i]<0)a[i]+=k;
			tmp1=a[i];
			//System.out.println(a[i]);
		}
		
		
        long ans=0;
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++){
			if(!map.containsKey(a[i])){
				map.put(a[i], 0);
			}
			ans+=map.getOrDefault(a[i],0);
			map.put(a[i], map.get(a[i])+1);
			if(i>=k-1){
				map.put(a[i-k+1], map.get(a[i-k+1])-1);
			}else{
				if(a[i]==0)ans++;
			}
		}	
			
			
		System.out.println(ans);
	}
}
		
	