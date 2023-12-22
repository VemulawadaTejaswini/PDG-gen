import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
       
    int n = scan.nextInt();
    
    int[] p = new int[n];
    
    for (int i = 0; i < n; i++) {
      p[i] = scan.nextInt();
    }
    
    for (int k = 0; k < n - 1; k++) {
    	if (p[k] != k + 1) {
    		break;
    	} else if (k == (n - 1)) {
    		System.out.print("YES");
    	}
    }
    
    int tmp = 0;
    
    for (int i = 0; i < n; i++) {
      tmp = p[i];
      
      for (int j = i; j < n; i++) {
        p[i] = p[j];
        p[j] = tmp;
        
        for (int k = 0; k < n - 1; i++) {
        	if (p[k] != k + 1) {
        		break;
        	} else if (k == (n - 1)) {
        		System.out.print("YES");
        	}
        }
      }
    }
    
    System.out.print("NO");
    return;
  }
}
