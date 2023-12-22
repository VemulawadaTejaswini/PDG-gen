import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		int z=0;
		long ans=0;
		while(z<N){
			String a=stdIn.next();
			String b="";
			int d[]=new int[26];
			for(int i=0;i<10;i++){
				char c=a.charAt(i);
				d[c-'a']++;
			}
			for(int i=0;i<26;i++){
				b+=String.valueOf(d[i]);
			}
			for(int i=0;i<10;i++){
				d[i]=0;
			}
			if(map.containsKey(b)){
				ans+=map.get(b);
				map.put(b,map.get(b)+1);
			}
			else
				map.put(b,1);
			z++;
		}
		System.out.println(ans);
	}
}