import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		final int n=sc.nextInt();
		final int k=sc.nextInt();
		
		int[] sum=new int[n];
		
		long ans=0;
		
		HashMap<Integer, Integer> map=new HashMap();
		//int[] map=new int[k];
		
		for(int i=0;i<n;i++){
			int m=sc.nextInt();
			int a=(m-1)%k;
			
			if(i==0){
				sum[i]=a;
			}else{
				sum[i]=(sum[i-1]+a)%k;
			}
			
			//map[sum[i]]++;
			if(map.containsKey(sum[i])){
				map.put(sum[i], map.get(sum[i])+1);
			}else{
				map.put(sum[i], 1);
			}
			
			if(i>=k-1)//map[sum[i-k+1]]--;{
				map.put(sum[i-k+1], map.get(sum[i-k+1])-1);
			      //System.out.println(" sum:"+sum[i]+" map:"+map[sum[i]]);
			
			if(i<k-1){
				if(sum[i]==0)ans++;
			}
			//ans=ans+map[sum[i]]-1;
			
			ans=ans+(map.get(sum[i]))-1;
			
	
			//System.out.println(" m:"+m+" a:"+a+" sum:"+sum[i]+" ans:"+ans);
			
		}
		System.out.println(ans);
	}
}
		
	