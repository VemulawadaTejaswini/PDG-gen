import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		
		int count_t=0;
		int count_s=0;
		for(int i=0;i<x.length();i++){
			if(x.charAt(i)=='T')count_t++;
			else break;
		}
		for(int i=x.length()-1;i>=0;i--){
			if(x.charAt(i)=='S')count_s++;
			else break;
		}
		System.out.println(Math.max(count_t, count_s)*2);
	}
}
