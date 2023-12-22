import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int C = sc.nextInt();
    	int max = Math.max(A, Math.max(B, C));
    	int min = Math.min(A, Math.min(B, C));
    	int mid = A+B+C-max-min;
    	int dir = max-mid;
    	int tmp = min+dir;
    	int res = (max-tmp)%2 == 0 ? (max-tmp)/2 : (max-tmp+1)/2+1;
    	System.out.println(dir+res);
    }
}