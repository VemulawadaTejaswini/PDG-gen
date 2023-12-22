import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
	    int[] x = new int[n];
	    for(int i=0; i<n; i++) {
	        x[i] = Integer.parseInt(sc.next());
	    }
	    int l, r;
	    int min = sa(x[n-1], x[0]);
	    int count = 0;
	    for(int i=0; i<n-k; i++) {
	        l = x[i];
	        r = x[i+k-1];
	        count = Math.min(zettai(l)+sa(r,l), zettai(r)+sa(r,l));
	        if(min > count) min = count;
	    }
	    
	    System.out.println(min);
    }
    
    static int sa(int a, int b) {
        if(a-b < 0) return  b-a;
        else return a-b;
    }
    
    static int zettai(int a) {
        if(a < 0) return -a;
        else return a;
    }
}