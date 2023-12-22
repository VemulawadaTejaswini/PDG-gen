import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static class UF{
		int[] par;
		UF(int N){
			par = new int[N];
			for(int i = 0 ; i < N ; ++i){
				par[i] = i;
			}
		}
		int root(int x){
			if(par[x] == x){
				return x;				
			}
			return par[x] = root(par[x]);
		}
		void unite(int x , int y){
			int rx = root(x);
			int ry = root(y);
			if(rx != ry){
				par[rx] = ry;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		UF uf = new UF(N);
		for(int i = 0 ; i < M ; ++i){
			int X = sc.nextInt() - 1;
			int Y = sc.nextInt() - 1;
			int Z = sc.nextInt() - 1;
			uf.unite(X, Y);
		}
		Set<Integer> s = new HashSet<Integer>();
		for(int i = 0 ; i < N ; ++i){
			s.add(uf.root(i));
		}
		System.out.println(s.size());
	}
}
