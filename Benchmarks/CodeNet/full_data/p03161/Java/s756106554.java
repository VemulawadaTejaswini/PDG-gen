import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = Integer.parseInt(sc.next());
	    int k = Integer.parseInt(sc.next());
	    
	    if (n<2 || n>10000) {
	    	System.out.println("Entrada invalida!!!");
	    	System.exit(0);
	    }
	    
	    if (k<1 || k>100) {
	    	System.out.println("Entrada invalida!!!");
	    	System.exit(0);
	    }
	    
	    int[] altura = new int[n];
	    int[] custo = new int[n];
	    
	    Arrays.fill(custo, Integer.MAX_VALUE);
	    custo[0] = 0;
	    
	    for(int i = 0; i < n; i++) altura[i] = Integer.parseInt(sc.next());
	    
	    for(int i = 0; i < n; i++) {
	      for(int j = 1; j <= k && i + j < n; j++) {
	        custo[i+j] = Math.min(custo[i+j], custo[i] + Math.abs(altura[i+j] - altura[i]));
	      }
	    }
	    
	    System.out.println(custo[n-1]);
	  }


}
