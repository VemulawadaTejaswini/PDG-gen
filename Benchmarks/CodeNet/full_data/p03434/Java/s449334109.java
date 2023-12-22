import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] s = new int[N];
    	
    	for (int i = 0; i < N; i++) {
			s[i] = sc.nextInt();
		}
    	
    	int max = 0;
    	
    	
    	Arrays.sort(s);
    	for(int x:s) {
    		max += x; 
    	}
    	
    	int bob = 0;
    	int tom = max;
    	
    	
    	for(int i = N-1;i <= 0;) {
    		tom -= i;
    		i = i-2;
    	}
    	bob = max-tom;
    	
    	System.out.println(bob-tom);
    }
}