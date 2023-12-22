
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	int a, b, c, x, y;
	public void run(){
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		solve();
	}
	
	int memo[][];
	
	public void solve(){
		int ans = 0;
		
		System.out.println(ret(x, y, 0));
		
	}
	
	public int ret(int xx, int yy, int sum){
		if(xx == 0 && yy == 0){
			return sum;
		}
		else if(xx == 0){
			if(b <= 2 * c){
				return ret(xx, 0, sum + b*yy);
			}
			else{
				return ret(xx, 0, sum + 2*c*yy);
			}
		}
		else if(yy == 0){
			if(a <= 2*c){
				return ret(0, yy, sum + a*xx);
			}
			else{
				return ret(0, yy, sum + 2*c*xx);
			}
		}
		else{
			int val = 0;
			if(a+b < 2*c){
				val = a+b;
			}
			else{
				val = 2*c;
			}
			
			if(xx < yy){
				return ret(0, yy - xx, sum + (val * xx));
			}
			else{
				return ret(xx-yy, 0, sum + (val * yy));
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
