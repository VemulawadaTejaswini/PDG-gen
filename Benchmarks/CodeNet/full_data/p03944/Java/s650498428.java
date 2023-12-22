import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();
		int r = W, t = H, l = 0, d = 0;
		for(int i = 0 ; i<N; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			if(a == 1){ // want > x
				l = Math.max(x, l);
			}
			else if( a == 2){ // want < x
				r = Math.min(x, r);
			}
			else if( a == 4){ // want < y
				t = Math.min(t, y);
			}
			else if( a == 3){ // want > y 
				d = Math.max(d, y);
			}
		}
	//	System.out.println( t+" "+d+" "+l+" "+r);
		if(t-d>0 && r-l >0)
		System.out.println((t-d)*(r-l));
		else System.out.println(0);
	}
}
