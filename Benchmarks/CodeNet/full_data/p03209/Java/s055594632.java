import java.util.Scanner;
public class Main{
	static long x;
	static int n;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		x = sc.nextLong();
		String d =dfs("P",0);
		long ans=0;
		for(char i: d.toCharArray()){
			if(i=='P'){
				ans++;
			}
		}
		System.out.println(ans);
	}
	public static String dfs(String a ,long lay){
		if(lay==n){
			return a;
		}else{
		if(a.length()+1>=x){
			return dfs(a.substring((int)(a.length()-x+1),a.length())+"B",lay+1);
		}else if(a.length()+1<x && 2*(a.length()+1)>=x){
			return dfs(a.substring((int)(2*(a.length()+1)-x),a.length())+"P"+a+"B",lay+1);
		}else{
			return dfs("B"+a+"P"+a+"B",lay+1);
		}
		}
	}
}