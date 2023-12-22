import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] s=sc.next().toCharArray();
		char[] t=sc.next().toCharArray();
		boolean[] sab=new boolean[26];
		char[] sch=new char[26];
		Arrays.fill(sch,'1');
		for(int i=0; i<s.length; i++){
			if(sch[s[i]-'a']=='1'){
				if(s[i]==t[i]){
					sch[s[i]-'a']=s[i];
					sab[s[i]-'a']=true;
				}else{
					sch[s[i]-'a']=t[i];
					sch[t[i]-'a']=s[i];
					sab[t[i]-'a']=true;
				}
			}else{
				if(sab[sch[s[i]-'a']-'a']){
					if(sch[s[i]-'a']!=t[i]){
						for(int u=0; u<26; u++){
							System.out.println(sch[u]+" "+sab[u]);
						}
						System.out.println("No"+i);
						return;
					}
				}else{
					if(sch[t[i]-'a']=='1'){
						if(sch[s[i]-'a']!=t[i]){
							sch[t[i]-'a']=sch[s[i]-'a'];
							sch[sch[s[i]-'a']-'a']=t[i];
							sch[s[i]-'a']=t[i];
						}
						sab[t[i]-'a']=true;
					}else{
						if(sch[s[i]-'a']!=sch[t[i]-'a']){
							sch[sch[t[i]-'a']-'a']=sch[s[i]-'a'];
							sch[sch[s[i]-'a']-'a']=sch[t[i]-'a'];
							sch[s[i]-'a']=sch[t[i]-'a'];
						}
						sab[sch[t[i]-'a']-'a']=true;
					}
				}
			}
		}
		System.out.println("Yes");
	}
}
