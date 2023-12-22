import java.util.*;
 
public class acmp{
	static Scanner in = new Scanner(System.in);
		// int n = in.nextInt();
		// int[] a = new int[n];
		// for(int i = 0; i<n; i++){
		// 	a[i] = in.nextInt();
		// }

		// int min = Integer.MAX_VALUE;
  		// int max = Integer.MIN_VALUE;
 	
	public static void main(String[] args) {
		//zhan
		//dos
		//md
		int test = 1;
		while(test>0){
			solve();
			test--;
		}
	}

	public static void solve(){
		int d = in.nextInt();
		int n = in.nextInt();
		if(d == 0){
			if(n/100 == 0){
				System.out.println(n);
			}else{
				System.out.println(n+n/100);
			}
		}else if(d == 1){
			System.out.println(n*100);
		}else{
			System.out.println(n*10000);
		}
	}
}