import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a = scan.nextInt();
		
		int[] x = new int[n];
		
		long s = 0;
		long sum = 0;
				
		for(int i = 0 ; i < n ; i++){
			x[i] = scan.nextInt() - a;
			if(x[i] == 0){
				s++;
			}
		}
		
		Arrays.sort(x);
		
		int[] xx = new int[50];
		int[] yy = new int[50];
		int c = 0;
		
		for(int i = n - 1 ; i >= 0 ; i--){
			if(x[i] > 0){
				//System.out.println(i + " " + x[i]);
				c++;
			} else {
				break;
			}
		}
		
		int cc = 1<<c;
		
		for(int i = 1 ; i < cc ; i++){
			
			int wa = 0;
			
			for(int j = 0 ; j < c ; j++){
				
				if((i >> j) % 2 == 1){
					wa += x[n - 1 - j];
				}
			}
			
			xx[wa]++;
		}
		
		int d = (n - c - (int)s);
		int dd = 1 << d;
		
		for(int i = 1 ; i < dd ; i++){
			
			int wa = 0;
			
			for(int j = 0 ; j < d  ; j++){
				
				if((i >> j) % 2 == 1){
					wa += x[j];
				}
			}
			
			yy[-wa]++;
		}
		s = (1L << s) - 1;
		for(int i = 0 ; i < 50 ; i++){
			sum += xx[i] * yy[i];
		}
		if((s != 0) && (sum != 0)){
			sum += sum * s + 1;
		} else if(sum == 0){
			sum = s;
		}
		System.out.println(sum);
	}
}
