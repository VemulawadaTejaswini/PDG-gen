import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
      	long res;
        if (k % 2 != 0) {
        	res = (n/k) * (n/k) * (n/k);
        } else {
        	int a = (n - (k/2)) / k + 1;
            res = (n/k) * (n/k) * (n/k) + a * a * a;
        }
      
      
        System.out.println(res);
	}
}