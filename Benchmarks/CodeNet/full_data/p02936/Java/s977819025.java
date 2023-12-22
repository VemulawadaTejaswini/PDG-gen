import java.util.*;
import static java.lang.System.*;

public class Main{
	  static HashMap<String, List<Integer>> arrows = new HashMap<>();  
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);  
	  
	  int N = sc.nextInt();
	  int Q = sc.nextInt();
	  long[] scores  = new long[N+10];
	  //階層
	  int[] hierarchy = new int[N+10];
	  for(int i=1; i<=N; i++) {
		  hierarchy[i] = 1000100;
		  List<Integer> list = new ArrayList<>();
		  arrows.put(String.valueOf(i), list);
	  }
	  hierarchy[1] = 0;
	  
	  //辺の情報を格納
	  for(int i=0; i<N-1; i++) {
		  int a = sc.nextInt();
		  int b = sc.nextInt();
		  if ( hierarchy[a] > hierarchy[b]) {
			  int swap = a;
			  a = b;
			  b = swap;
		  }		    
			  hierarchy[b] = hierarchy[a] + 1;
			  List<Integer> list = arrows.get(String.valueOf(a));
			  list.add(b);	
	  }
	  
	  for(int i=0; i<Q; i++) {
		  int p= sc.nextInt();
		  int x = sc.nextInt();
		  dfs(p,x,scores);
	  }
	  
	  for(int i=1 ; i<= N; i++) {
		  out.print(scores[i] + " ");
	  }  
	}
  		public static  void dfs(int p, int x, long[] scores) {
  			scores[p] += x;
  			List<Integer> list = arrows.get(String.valueOf(p));
  			for(int i=0; i<list.size(); i++) {
  				int n = list.get(i);
  				dfs(n, x , scores);
  			}
  		}
  }	