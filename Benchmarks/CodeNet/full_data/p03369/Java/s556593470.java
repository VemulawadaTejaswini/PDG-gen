import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	String n;
	public void run(){
		n = sc.next();
		solve();
	}
	public void solve(){
		int ans = 700;
		for(int i = 0; i < 3; i++){
			String s = n.substring(i, i+1);
			if(s.equals("o")){
				ans += 100;
			}
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
	static class Pair {
        int first,second;
        public Pair(int a,int b) {
            this.first = a;
            this.second = b;
        }
    }	
}
