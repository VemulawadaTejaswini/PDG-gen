import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[] s=sc.next().toCharArray();
		BIT[] count=new BIT[26];
		for(int j=0; j<26; j++){
			count[j]=new BIT(1+s.length*2);
		for(int i=1; i<=s.length; i++){
			if((s[i-1]-'a')==j){
				count[j].add(i);
			}
		}
		}
		int q=sc.nextInt();
		for(int i=0; i<q; i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==1){
				char c=sc.next().charAt(0);
				count[c-'a'].add(b);
			}else{
				int c=sc.nextInt();
				int ans=0;
				for(int j=0; j<26; j++){
					if(count[j].get(c)-count[j].get(b-1)>0){
						ans++;
					}
				}
				System.out.println(ans);
			}
		}
	}
	static class BIT{
		int n;
		int[] data;
		BIT(int n){
			this.n=n;
			data = new int[n+1];
		}
		void add(int i){
			for(;i<=n;i+=i&(-i))data[i]+=1;
		}
		int get(int i){
			int res = 0;
			for(;i>0;i-=i&(-i))res+=data[i];
			return res;
		}
	}
}
