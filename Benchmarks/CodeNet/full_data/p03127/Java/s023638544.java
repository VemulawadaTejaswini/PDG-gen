import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int[] monsters = new int[n];
    	
    	for (int i = 0; i < n; i++) {
    		monsters[i] = in.nextInt();
    	}
    	
    	int ansGcd = 0;
    	for (int i = 0; i < n; i++) {
    		ansGcd = gcd(ansGcd,monsters[i]);
    	}
    	
    	System.out.println(ansGcd);
    }
    
    private static int gcd(int a,int b) {
     	if (a == 0) return b;
    	else return gcd(b%a, a);
    }
}

