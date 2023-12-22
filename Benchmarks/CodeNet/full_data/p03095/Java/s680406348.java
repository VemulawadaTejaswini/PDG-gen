import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		String s=sc.next();
		long mod=1000000007;
		long ans=0;
		char[] al=new char[26];
		long[] cou=new long[n];
		for(int i = 0; i<n; i++){
			char a=s.charAt(i);
			if(al[a-'a']!=0){
				ans+=cou[i-al[a-'a']-1];
			}else{
				ans=ans*2+1;
			}
			ans%=mod;
			al[a-'a']++;
			cou[i]=ans;
		}
		System.out.println(ans);
	}
}