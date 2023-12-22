
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int m =  sc.nextInt();
		
		int p[] = new int[n];
		
		for(int i = 0 ; i < n ; i++){
			p[i] = sc.nextInt()-1;
		}
		int x[] = new int[m];
		int y[] = new int[m];
		
		for(int i = 0; i < m ; i++){
			x[i] = sc.nextInt()-1;
			y[i] = sc.nextInt()-1;
		}
		
		init(n);
		for(int i = 0; i < m ; i++){
			union(x[i],y[i]);
		}
		
		int res = 0;
		for(int i = 0; i < n ; i++){
			if(find(p[i]) == find(i)){
				res++;
			}
		}
		System.out.println(res);
		
	}
	int[] uf;
	
	void init(int n){
		uf = new int[n];
		for(int i=0;i<n;i++){
			uf[i]= i;
		}
	}
	
	int find(int k){
		if(uf[k] == k){
			return k;
		}else{
			uf[k] = find(uf[k]);
			return uf[k];
		}
	}
	
	void union(int x,int y){
		if(find(x) != find(y)){
			uf[find(x)] = find(y);
		}
	}
	
}
