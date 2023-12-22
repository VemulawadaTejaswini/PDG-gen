import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		PriorityQueue<St> q=new PriorityQueue<>((t,r)->(r.var-t.var));
		for(int i=0; i<a; i++){
			q.add(new St(sc.nextInt(),0));
		}
		for(int i=0; i<b; i++){
			q.add(new St(sc.nextInt(),1));
		}
		for(int i=0; i<c; i++){
			q.add(new St(sc.nextInt(),2));
		}
		long ans=0;
		long sum=0;
		while(!q.isEmpty()){
			St s=q.poll();
			if(s.idx==0){
				if(x==0){
					continue;
				}
				x--;
			}else if(s.idx==1){
				if(y==0){
					continue;
				}
				y--;
			}else{
				if(sum==x+y){
					break;
				}
				sum++;
			}
			ans+=s.var;
		}
		System.out.println(ans);
	}
	static class St{
		int var,idx;
		St(int var,int idx){
			this.var=var;
			this.idx=idx;
		}
	}
}
