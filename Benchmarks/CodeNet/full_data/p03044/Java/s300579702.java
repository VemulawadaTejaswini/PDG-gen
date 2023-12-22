import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 
 
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		int N = Integer.parseInt(sc.next());
		int[] ans = new int[N];
		Arrays.fill(ans,9);
		List<int[]> edges = new ArrayList<>();
		
		for(int i=0;i<N-1;i++){
			int[] edge = new int[3];
			edge[0] = Integer.parseInt(sc.next());
			edge[1] = Integer.parseInt(sc.next());
			edge[2] = Integer.parseInt(sc.next());
			edges.add(edge);
		}
		edges.sort((a,b) -> Integer.compare(a[0], b[0]));
		for(int i=0; i<N-1; i++){
			int u=edges.get(i)[0]-1;
			int v=edges.get(i)[1]-1;
			int w=edges.get(i)[2];
			int u_now_color = ans[u];
			
			if(w%2 == 0){
				if(u_now_color == 9){
					ans[u] = 0;
					ans[v] = 0;
				}else{
					ans[u] = u_now_color;
					ans[v] = u_now_color;
				}
				
			}else{
				if(u_now_color == 9){
					ans[u] = 0;
					ans[v] = 1;
				}else{
					ans[u] = u_now_color;
					ans[v] = u_now_color==0?1:0;
				}
				
			}
			
			
		}
		
		for(int ans_ : ans){
			System.out.println(ans_);
		}
		
		sc.close();
	}
	
	
	
}