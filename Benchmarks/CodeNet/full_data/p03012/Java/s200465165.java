import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]w = new int[n];

    int all = 0;
    int mae = 0;
    int cou = 0;
    for(int i=0; i<n; i++) {
    	w[i] = sc.nextInt();
    		all += w[i];
      	}
    for(int i=0; i<=n; i++) {
    	if(mae < all/2) {
    		mae += w[i];
    	   	cou++;
    	   	   	}
    	}
    int usiro = all - mae;
    int A = mae - usiro;
    A =	Math.abs(A);
    int B = (mae - w[cou-1]) - (usiro + w[cou-1]);
    B = Math.abs(B);
    
    System.out.print(Math.min(A, B));
    }
}
