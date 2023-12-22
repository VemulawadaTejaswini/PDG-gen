import java.util.*;
public class Main {	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int aa = sc.nextInt();
		double x[] = new double[aa];
		for(int n = 0; n < aa; n++){
			x[n] = sc.nextDouble();
		}
		Arrays.sort(x);
		double ans = x[0];
		for(int n=1;n<aa;n++){
			ans = (ans + x[n]) / 2;
		}
		System.out.println(ans);
	}
	
}