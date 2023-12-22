import java.lang.Math;
import java.util.Scanner;
class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long sum = 1;
        if (n%2 != 0) {
        		for (int i=1; i<=n/2; i++) {
        			int num = 1;
        			for (int j=1; j<=i; j++) {
        				num = num * (n-j+1) / j;
        			}
        			sum += num*2;
        		}
        		int aa = 1;
        		for (int j=1; j<=a; j++) {
    				aa = aa * (n-j+1) / j;
    			}
        		int bb = 1;
        		for (int j=1; j<=b; j++) {
    				bb = bb * (n-j+1) / j;
    			}
        		sum = sum - aa - bb;
        		System.out.println(sum%((int)Math.pow(10, 9)+7));
        } else {
        	for (int i=1; i<=n/2; i++) {
    			int num = 1;
    			for (int j=1; j<=i; j++) {
    			
    				num = num * (n-j+1) / j;
    			}
    			if (i == n/2) {
    				sum += num;
    			} else {
    				sum += num*2;
    			}
    			
    		}
    		int aa = 1;
    		for (int j=1; j<=a; j++) {
				aa = aa * (n-j+1) / j;
			}
    		int bb = 1;
    		for (int j=1; j<=b; j++) {
				bb = bb * (n-j+1) / j;
			}
    		sum = sum - aa - bb;
    		System.out.println(sum%((int)Math.pow(10, 9)+7));
        }
    }
} 