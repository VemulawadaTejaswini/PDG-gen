import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer>list=new ArrayList<>();
		Map<String,List<Integer>>map=new HashMap<>();
		int n=sc.nextInt();
		int q=sc.nextInt();
		String s=sc.next();
		int gorem[]=new int[n];
		for(int i=0;i<n;i++) {
		 gorem[i]=1;
		 if(map.containsKey(s.substring(i, i+1)))map.get(s.substring(i,i+1)).add(i);
		 else{
			 List<Integer>insert=new ArrayList<>();
			 insert.add(i);
			 map.put(s.substring(i,i+1),insert);
		 }
		}

		for(int i=0;i<q;i++) {
			String S=sc.next();String D=sc.next();
			if(map.containsKey(S)) {
			List<Integer>insert=map.get(S);
			for(int j : insert) {
	            if(D.equals("L")) {
	            	if(j-1>-1)gorem[j-1]+=gorem[j];
	            	gorem[j]=0;
	            }else {
	            	if(j+1<n)gorem[j+1]+=gorem[j];
	            	gorem[j]=0;
	            }
	        }
			}
		}
		int ans=0;
		for(int i=0;i<n;i++)ans+=gorem[i];//集計
		System.out.println(ans);
	}
}