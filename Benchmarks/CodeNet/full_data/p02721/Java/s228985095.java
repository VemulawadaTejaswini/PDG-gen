import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int c=sc.nextInt();
		char[] s=sc.next().toCharArray();
		St[] front=new St[n+2];
		St[] back=new St[n+2];
		back[0]=new St(0,-200000);
		int idx=0;
		for(int i=1; i<=n; i++){
			back[i]=back[i-1];
			if(idx<i && s[i-1]=='o'){
				back[i]=new St(back[i].sum+1,i);
				idx=i+c;
			}
		}
		if(back[n].sum<k){
			return;
		}
		front[n+1]=new St(0,200000);
		idx=n+1;
		for(int i=n; i>=1; i--){
			front[i]=front[i+1];
			if(idx>i && s[i-1]=='o'){
				front[i]=new St(front[i].sum+1,i);
				idx=i-c;
			}
		}
		for(int i=1; i<=n; i++){
			if(s[i-1]=='o'){
				int sum=front[i+1].sum+back[i-1].sum;
				if(front[i+1].recent-back[i-1].recent<=c){
					sum--;
				}
				if(sum<k){
					System.out.println(i);
				}
			}
		}
	}
	static class St{
		int sum,recent;
		St(int sum,int recent){
			this.sum=sum;
			this.recent=recent;
		}
	}
}
