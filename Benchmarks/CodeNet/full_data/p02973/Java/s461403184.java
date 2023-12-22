import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		TreeMap<Integer,Integer> map=new TreeMap<>();
		for(int i=0; i<n; i++){
			int a=sc.nextInt();
			if(map.containsKey(a)){
				map.put(a,map.get(a)+1);
			}else{
				map.put(a,1);
			}
			Integer tmp=map.lowerKey(a);
			if(tmp!=null){
				if(map.get(tmp)>1){
					map.put(tmp,map.get(tmp)-1);
				}else{
					map.remove(tmp);
				}
			}
		}
		int ans=0;
		for(int i:map.keySet()){
			ans+=map.get(i);
		}
		System.out.println(ans);
	}
}
