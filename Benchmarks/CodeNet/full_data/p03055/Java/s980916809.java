                                                                               
import java.util.ArrayList;                                                                         
import java.util.HashMap;                                                                           
import java.util.HashSet;                                                                           
import java.util.List;                                                                              
import java.util.Map;                                                                               
import java.util.Scanner;                                                                           
import java.util.Set;                                                                               
                                                                                                    
public class Main {                                                                                 
	Scanner sc = new Scanner(System.in);                                                            
	                                                                                                
	public static void main(String[] args) {                                                        
		Main m = new Main();                                                                        
		m.run();                                                                                    
	}                                                                                               
	                                                                                                
	void run() {                                                                                    
		int n = sc.nextInt();                                                                       
		                                                                                            
		int[]a = new int[n];                                                                        
		int[]b = new int[n];                                                                        
		                                                                                            
		Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();                      
		                                                                                            
		                                                                                            
		int start =0;                                                                               
                                                                                                    
		for(int i =0 ; i < n-1 ;i++) {                                                              
			a[i] = sc.nextInt();                                                                    
			b[i] = sc.nextInt();                                                                    
			                                                                                        
			map.computeIfAbsent(a[i], x -> new ArrayList(0)).add(b[i]);                             
			map.computeIfAbsent(b[i], x -> new ArrayList(0)).add(a[i]);                             
			                                                                                        
			start = a[i];                                                                           
		}                                                                                           
		                                                                                            
		int[] posLength = dfsLongest(start, map);                                                   
		int[] res = dfsLongest(posLength[1],map);                                                   
		                                                                                            
		System.out.println( res[0] % 2 == 1 ? "First" : "Second");                                  
	}                                                                                               
	                                                                                                
	int[] dfsLongest(int start,Map<Integer,List<Integer>> map) {                                    
		return dfs(start,map,1,-1);                                                                 
	}                                                                                               
	                                                                                                
	int[] dfs(int now, Map<Integer,List<Integer>> map, int len, int from) {                         
		int[] res = null;                                                                           
		                                                                                            
		for(int next : map.get(now)) {                                                              
			if(next == from) {                                                                      
				continue;                                                                           
			}                                                                                       
			                                                                                        
			int[] r = dfs(next,map,len+1,now);                                                      
			if(res == null) {                                                                       
				res = r;                                                                            
			}else {                                                                                 
				if(r[0] > res[0]) {                                                                 
					res = r;                                                                        
				}                                                                                   
			}                                                                                       
		}                                                                                           
		if(res == null) {                                                                           
			return new int[] {len,now};                                                             
		}                                                                                           
		return res;                                                                                 
	}                                                                                               
                                                                                                    
}                                                                                                   
                                                                                                    