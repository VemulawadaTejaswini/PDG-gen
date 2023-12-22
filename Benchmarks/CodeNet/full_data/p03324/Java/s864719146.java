import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int d = sc.nextInt();
        int n = sc.nextInt();
        double ans = n;
        if(!(d == 0)){
        	ans = Math.pow(100, d);
            ans = ans * n;
        }
        System.out.println((int)ans);
    }
}