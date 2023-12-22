import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int[] buka = new int[N+1];
	    int a = 0;
	    for(int i = 2; i <= N; i++) {
	        a = sc.nextInt();
	        buka[a] += 1;
	    }
	    
	    for(int i = 1; i <= N; i++) {
	        System.out.println(buka[i]);
	    }
	}
}