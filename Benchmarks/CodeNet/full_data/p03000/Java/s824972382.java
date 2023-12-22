import java.util.*;
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int x = sc.nextInt();
	int[] l = new int[n+1];

	for(int i = 0; i < n; i++) {
	    l[i] = sc.nextInt();
	}

	int d1 = 0;
	int di = d1;
	
	
	for(int i = 1; i <= n; i++) {
	    if(di > x) {
		System.out.println(i-1);
		System.exit(0);
	    }
	    di += l[i-1];
	    
	}
	

	System.out.println(n);
    }
}