import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	String s;
	int k;
	public void run(){
		s = sc.next();
		k = sc.nextInt();
		solve();
	}
	public void solve(){
		ArrayList<String> list = new ArrayList<String>();
		for(int a = 0; a < s.length(); a++){
			for(int b = a+1; b < s.length() + 1; b++){
				String nows = s.substring(a, b);
				if(list.size() >= k){
					if(nows.compareTo(list.get(k-1)) >= 0){
						break;
					}
				}
				
				for(int i = 0; i < k; i++){
					if(list.size() <= i){
						list.add(i, nows);
						break;
					}
					else if(nows.compareTo(list.get(i)) == 0){
						break;
					}
					else if(nows.compareTo(list.get(i)) < 0){
						list.add(i, nows);
						break;
					}
				}
			}
		}
		System.out.println(list.get(k-1));
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
