import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[2*m];
		int[] b = new int[2*m];
		int[] color = new int[n];
		int[][] dist = new int[n][n];
		for(int i=0;i<n;i++){
			color[i] = 0;
			for(int j=0;j<n;j++){
				dist[i][j] = Integer.MAX_VALUE;
			}
			dist[i][i] = 0;
		}
		
		int x;
		int y;
		
		for(int i=0;i<m;i++){
			a[2*i] = sc.nextInt()-1;
			b[2*i] = sc.nextInt()-1;
			a[2*i+1] = b[2*i];
			b[2*i+1] = a[2*i];
			dist[a[2*i]][b[2*i]] = 1;
			dist[b[2*i]][a[2*i]] = 1;
			}
		}
		
		boolean changed = true;
		int kouho1=0;
		int kouho2=0;
		while(changed){
			changed = false;
			for(int i=0; i<2*m; i++){
				for(int j=0; j<n; j++){
					if(dist[a[i]][j] != Integer.MAX_VALUE){
						kouho1 = dist[a[i]][j]+1;
					}else{
						kouho1 = Integer.MAX_VALUE;
					}
					if(dist[b[i]][j] != Integer.MAX_VALUE){
						kouho2 = dist[b[i]][j]+1;
					}else{
						kouho2 = Integer.MAX_VALUE;
					}
					if(dist[a[i]][j] > kouho2){
						dist[a[i]][j] = kouho2;
						changed = true;
					}
					if(dist[b[i]][j] > kouho1){
						dist[b[i]][j] = kouho1;
						changed = true;
					}
				}
			}
		}
			
		int q = sc.nextInt();
		int v;
		int d;
		int c;
		for(int i=0; i<q; i++){
			v = sc.nextInt()-1;
			d = sc.nextInt();
			c = sc.nextInt();
			for(int j=0; j<n; j++){
				if(dist[v][j]<=d){
					color[j] = c;
				}
			}
			/*for(int j=0; j<n; j++){
				System.out.println(color[j]);
			}*/
		}
		
		/*for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				System.out.println("dist["+i+"]["+j+"] = "+dist[i][j]);
			}
		}*/
		
		
		for(int i=0; i<n; i++){
			System.out.println(color[i]);
		}
		return;
	}
}