import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.next());
		HashMap<Integer,Boolean> map=new HashMap<Integer,Boolean>();
		for(int i=0;i<n;i++){
			int a=Integer.parseInt(sc.next());
			Boolean t=map.get(a);
			if(t==null)
				map.put(a,true);
			else
				map.put(a,!t);
		}
		int ans=0;
		for(Integer k:map.keySet())
			if(map.get(k))
				ans++;
		System.out.println(ans);
	}
}