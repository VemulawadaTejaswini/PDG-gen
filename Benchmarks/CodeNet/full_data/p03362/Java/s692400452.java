import java.util.Scanner;
import java.util.LinkedList;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n;
	int len = 55556;
	int[] sosuu = new int[len];
	
	public void run(){
		n = sc.nextInt();
		solve();
	}
	public void solve(){
		
		for(int i = 2; i < len; i++){
			sosuu[i] = 1;
		}
		
		for(int i = 2; i < len; i++){
			if(sosuu[i] == 1){
				int j = i + i;
				while(j < len){
					sosuu[j] = 0;
					j = j + i;
				}
			}
		}
		for(int i = 2; i< len; i++){
			if(i % 5 != 1){
				sosuu[i] = 0;
			}
		}
		
		int num = 0;
		for(int i = 2; i < len; i++){
			if(sosuu[i] == 1){
				System.out.print(i);
				num = num + 1;
				if(num == n){
					break;
				}
				else{
					System.out.print(" ");
				}
			}
		}
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