import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		long[]alph=new long[26];
		ArrayList<Integer>[] alphId=new ArrayList[26];
		for(int i=0;i<26;i++) {
			alphId[i]=new ArrayList<Integer>();
		}
		for(int i=0;i<n;i++) {
			alph[s.charAt(i)-'a']++;
			alphId[s.charAt(i)-'a'].add(i);
		}
		
		long ans=n*(n-1)/2+1;
		for(int k=0;k<26;k++) {
			if(alph[k]>1) {
				ans-=alph[k]*(alph[k]-1)/2;
			}
		}
		System.out.println(ans);
	}
}