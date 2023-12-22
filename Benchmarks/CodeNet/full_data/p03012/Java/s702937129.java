import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]w = new int[n];
 
    int all = 0;
    for(int i=0; i<n; i++){
        w[i] = sc.nextInt();
        all += w[i];
    }
    int mae = 0;
    for(int i=0; i<n; i++) {
    	if(mae*2 < all) {
    		mae += w[i];
    	}
    }
    int A = all-mae-mae;
    A = Math.abs(A);
    
    System.out.println(A);
    }
}
