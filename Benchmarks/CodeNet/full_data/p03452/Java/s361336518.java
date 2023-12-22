import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int n=sc.nextInt();
		int m=sc.nextInt();	
		int[][] data=new int[m][3];
		for(int i=0;i<data.length;i++){
			data[i][0]=sc.nextInt()-1;
			data[i][1]=sc.nextInt()-1;
			data[i][2]=sc.nextInt();
		}
		if(solve(n,data))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static boolean solve(int n,int[][] data) {
		// TODO Auto-generated method stub
		Set<Integer> s=new HashSet<Integer>();
		List<Integer[]>[] g=new ArrayList[n];
		for(int i=0;i<data.length;i++){
			if(!s.contains(data[i][0])&&!s.contains(data[i][1])){
				s.add(data[i][0]);
				s.add(data[i][1]);
				g[data[i][0]]=new ArrayList<Integer[]>();
				g[data[i][1]]=new ArrayList<Integer[]>();
				Integer[] tar={data[i][1],data[i][2]};
				g[data[i][0]].add(tar);
				Integer[] tar2={data[i][0],-data[i][2]};
				g[data[i][1]].add(tar2);
			}
			else if(!s.contains(data[i][0])){
				s.add(data[i][0]);
				g[data[i][0]]=new ArrayList<Integer[]>();
				Integer[] tar={data[i][1],data[i][2]};
				g[data[i][0]].add(tar);
				Integer[] tar2={data[i][0],-data[i][2]};
				g[data[i][1]].add(tar2);
			}
			else if(!s.contains(data[i][1])){
				s.add(data[i][1]);
				g[data[i][1]]=new ArrayList<Integer[]>();
				Integer[] tar={data[i][1],data[i][2]};
				g[data[i][0]].add(tar);
				Integer[] tar2={data[i][0],-data[i][2]};
				g[data[i][1]].add(tar2);
			}
			else{
				int val1=dis(g,data[i][0],data[i][1]);
				int val2=dis(g, data[i][1],data[i][0]);


				if(val1+val2!=0||val1!=data[i][2])
						return false;
			}

		}
		return true;
		
	}

	private static int dis(List<Integer[]>[] g, int i, int j) {
		// TODO Auto-generated method stub
		Set<Integer> checked=new HashSet<Integer>();
		int[] val={0};
		dfs(g,i,j,checked,val);
		return val[0];

	}

	private static boolean dfs(List<Integer[]>[] g, int i, int j, Set<Integer> checked,int[] val) {
		// TODO Auto-generated method stub

		checked.add(i);
		List<Integer[]> l=g[i];
		for(int ii=0;ii<l.size();ii++){
			Integer[] arr=l.get(ii);
			if(arr[0]==j){
				val[0]+=arr[1];
				return true;
			}else if(!checked.contains(arr[0])){
				if( dfs(g,arr[0],j,checked,val)){
					val[0]+=arr[1];
					return true;
				}
			}
			
		}
		return false;
	}
}