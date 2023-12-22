
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
	
	String str = "ABAABABABABABABABABBBBABAABABAABABBABBABABBABABAAABABABBBABABBBAAABABABAAAABABABABABB";

	void run(){
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		String ss = sc.next();
		char[] s = ss.toCharArray();
		
				
		HashMap<Integer,List<Integer>> mapA = new HashMap<>();
		HashMap<Integer,List<Integer>> mapB = new HashMap<>();

		for(int i = 0; i < m ; i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			
			Map<Integer,List<Integer>> map = mapB;
			if(s[b] == 'A'){
				map = mapA;
			}else{
				map = mapB;
			}
			if(map.containsKey(a)){
				map.get(a).add(b);
			}else{
				List<Integer> list = new LinkedList<Integer>();
				list.add(b);
				map.put(a, list);
			}
			if(s[a] == 'A'){
				map = mapA;
			}else{
				map = mapB;
			}
			if(map.containsKey(b)){
				map.get(b).add(a);
			}else{
				List<Integer> list = new LinkedList<Integer>();
				list.add(a);
				map.put(b, list);
			}
		}
		
		int ptr = 0;
		for(int pos= 0;pos < n ; pos++){
			if(dfs(mapA,mapB,str,pos,ptr,ss)){
				System.out.println("Yes");
				return;
			};
		}
		System.out.println("No");
	}
	
	
	boolean dfs(Map<Integer,List<Integer>> mapA,Map<Integer,List<Integer>> mapB,String str,int pos,int ptr,String s){
		if(pos >= str.length()){
			return true;
		}
		char next = str.charAt(pos);
		Map<Integer,List<Integer>> map = null;
		if(next == 'A'){
			map = mapA;
		}else{
			map = mapB;
		}
		
		for( int x : map.get(ptr)){
			if(dfs(mapA,mapB,str,x,ptr+1,s)){
				return true;
			}
		}
		return false;
	}
	
}
