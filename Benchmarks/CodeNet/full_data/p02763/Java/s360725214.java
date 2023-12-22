import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[] s=sc.next().toCharArray();
		int q=sc.nextInt();
		TreeSet<Integer>[] set=new TreeSet[26];
		for(int i=0; i<26; i++){
			set[i]=new TreeSet<>();
		}
		for(int i=0; i<n; i++){
			set[s[i]-'a'].add(i);
		}
		for(int i=0; i<q; i++){
			int a=sc.nextInt();
			if(a==1){
				int b=sc.nextInt()-1;
				char c=sc.next().charAt(0);
				set[s[b]-'a'].remove(b);
				set[c-'a'].add(b);
				s[b]=c;
			}else{
				int b=sc.nextInt()-1;
				int c=sc.nextInt()-1;
				int ans=0;
				for(int j=0; j<26; j++){
					 Integer ch=set[j].ceiling(b);
         			 if(ch!=null&&ch<=c){
            			ans++;
          			}
				}
				System.out.println(ans);
			}
		}
	}
}
