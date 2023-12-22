import java.util.Scanner;
import java.util.HashMap;
public class Main{
	static int n;
	static int m;
	static boolean[] re;
	static HashMap<Integer,Integer>[] map;
	static int[] cor;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		re=new boolean[n+1];
		cor=new int[n+1];
		int[] l = new int[m];
		int[] r = new int[m];
		int[] d = new int[m];
		for(int i = 0; i < m; i++){
			l[i]=sc.nextInt();
			r[i]=sc.nextInt();
			d[i]=sc.nextInt();
		}
		map=new HashMap[n+1];
		for(int i=0; i<=n; i++){
			map[i]=new HashMap<>();
		}
		for(int i = 0; i<m; i++){
			map[l[i]].put(r[i],d[i]);
			map[r[i]].put(l[i],-d[i]);
		}
		for(int i = 1; i<=n; i++){
			if(!re[i]){
				boolean flag=dfs(i,0);
				if(!flag){
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
	public static boolean dfs(int i,int pos){
		if(re[i]){
			return pos==cor[i];
		}
		re[i]=true;
		cor[i]=pos;
		for(Integer w: map[i].keySet()){
			if(!dfs(w,map[i].get(w)+pos)){
				return false;
			}
		}
		return true;
	}
}