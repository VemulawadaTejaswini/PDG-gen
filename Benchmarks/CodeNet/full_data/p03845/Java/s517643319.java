import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]t = new int[n];
    
    int all = 0;
    for(int i=0; i<n; i++) {
    	t[i] = sc.nextInt();
    	all += t[i];
    }
    int m = sc.nextInt();
    int[]p = new int[n];
    int[]x = new int[n];

    for(int i=0; i<m; i++) {
    	p[i] = sc.nextInt();
    	x[i] = sc.nextInt();
    }

    for(int i=0; i<m; i++) {
    	System.out.println(all - t[p[i]-1] + x[i]);
    }
}
}