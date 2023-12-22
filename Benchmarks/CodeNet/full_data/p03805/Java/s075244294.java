import java.io.*;
import java.util.*;

public class Main{

    static ArrayList<ArrayList<Integer>> edges=new ArrayList<>();
    static boolean did[];
    
    static int ans=0;
    static int n;
    
    public static void main(String agrs[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	String str[]=br.readLine().split(" ");

	n=Integer.parseInt(str[0]);
	int m=Integer.parseInt(str[1]);

	did=new boolean[n];


	for(int i=0;i<n;i++){
	    edges.add(new ArrayList<>());
	}
	
	for(int i=0;i<m;i++){
	    str=br.readLine().split(" ");

	    int a=Integer.parseInt(str[0])-1;
	    int b=Integer.parseInt(str[1])-1;

	    edges.get(a).add(b);
	    edges.get(b).add(a);
	}

	did[0]=true;
	dfs(0,n);
	System.out.println(ans);
    }

    static void dfs(int s,int a){
	if(a==1){
	    ans++;
	    return;
	}

        for(Integer i:edges.get(s)){
	    if(!did[i]){
		did[i]=true;
		dfs(i,a-1);
		did[i]=false;
	    }
	}
    }
}
