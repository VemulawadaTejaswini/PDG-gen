import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] s=sc.next().toCharArray();
		char[] t=sc.next().toCharArray();
		char[] sch=new char[26];
		Arrays.fill(sch,'1');
		for(int i=0; i<s.length; i++){
			if(sch[s[i]-'a']=='1'){
				if(s[i]!=t[i]){
					sch[s[i]-'a']=t[i];
					sch[t[i]-'a']=s[i];
				}else{
					sch[s[i]-'a']='2';
				}
			}else{
				if(sch[s[i]-'a']=='2'){
					if(s[i]!=t[i]){
						System.out.println("No");
						return;
					}
				}else if(sch[s[i]-'a']!=t[i]){
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}
