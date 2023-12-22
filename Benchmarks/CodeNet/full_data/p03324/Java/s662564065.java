import java.util.*;
public class Main { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		double temp = 0;
		int ans = 0;
		if(n == 100) {
			temp = 101 * Math.pow(n, d);
			ans = (int)temp;
		}
		else{temp = Math.pow(100, d) * n;
		ans = (int)temp;
		}
		System.out.println(ans);
     }
}