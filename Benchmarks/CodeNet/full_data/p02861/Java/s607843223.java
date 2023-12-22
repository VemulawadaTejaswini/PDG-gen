import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        double sum = 0;
        double ave = 0;
        for(int i = 0; i < n; i++){
        	x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
        	for(int j = i + 1; j < n; j++){
            	double a = Math.sqrt(Math.pow((x[i] - x[j]), 2) + Math.pow((y[i] - y[j]), 2));
                sum += a;
            }
        }
        int num = 2;
        for(int i = 2; i <= n; i++){
        	 num = (i - 1) * num;	
        }
        int fac = n;
        for(int i = n - 1; i >= 1; i--){
        	fac = fac * i;
        }
        ave = (sum * (double)num) / fac;
        System.out.println(ave);
    }
}