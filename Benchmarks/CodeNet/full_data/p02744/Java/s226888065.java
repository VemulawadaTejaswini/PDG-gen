import java.util.*;
import java.io.PrintWriter;
public class Main{
	static int n;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int size=1;
		dfs(new StringBuilder("a"),1);
	}
	static void dfs(StringBuilder sb,int count){
		if(count==n){
			System.out.println(sb);
			return;
		}
		for(int i=0; i<=count; i++){
			dfs(new StringBuilder(sb).append((char)((int)'a'+i)),count+1);
		}
	}
}
