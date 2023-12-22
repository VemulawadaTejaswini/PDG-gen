import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	static boolean[] visited=new boolean[100000*2];
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	static long xc;
	static long yc;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<100000*2; i++){
			ArrayList<Integer> tmp=new ArrayList<>();
			list.add(tmp);
		}
		int[] x=new int[n];
		for(int i=0; i<n; i++){
			x[i]=sc.nextInt()-1;
			int y=sc.nextInt()-1+100000;
			list.get(x[i]).add(y);
			list.get(y).add(x[i]);
		}
		long sum=0;
		for(int i:x){
			xc=0;
			yc=0;
			dfs(0,i);
			sum+=xc*yc;
		}
		System.out.println(sum-n);
	}
	static void dfs(int count,int i){
		if(!visited[i]){
			visited[i]=true;
			if(count%2==0){
				xc++;
			}else{
				yc++;
			}
			for(int j:list.get(i)){
				dfs(count+1,j);
			}
		}
	}
}
