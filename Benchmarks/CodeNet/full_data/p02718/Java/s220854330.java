import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        Integer[] a = new Integer[n+1];
        int sum = 0;
        for(int i = 1; i <= n; i++){
        	a[i] = cin.nextInt();
        	sum += a[i];
        }
        Arrays.sort(a,1,1+n);
        int cnt = 0;
        for(int i = n; i >= 1; i--){
        	if(4*m*a[i] > sum) cnt++;
        	else break;
        }
        if(cnt >= m) System.out.println("Yes");
        else System.out.println("No");
    }
}