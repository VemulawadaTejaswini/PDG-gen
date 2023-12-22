import java.util.*;

class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] L = new long[n];
    L[0] = 2;
    L[1] = 1;
    if(n == 1) {
    	System.out.println(1);
    } else {
        for(int i = 2; i <= n; i++) {
        	L[i] = L[i-1] + L[i-2];
        	if(i == n) {
        		System.out.println(L[i]);
        	}
        }
    }
}
}