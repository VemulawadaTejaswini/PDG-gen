import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double[] expect = new double[n];
        for(int i = 0; i < n; i++) {
        	int num = sc.nextInt();
        	expect[i] = (num + 1)  / 2.0;
        }
        double maxE = 0;
        double curE = 0;
        for(int i = 0; i < n; i++) {
        	curE += expect[i];
        	if(i >= k - 1) {
        		maxE = Math.max(maxE, curE);
        		curE -= expect[i - k + 1];
        	} 
        }
        System.out.println(maxE);
    }
}
