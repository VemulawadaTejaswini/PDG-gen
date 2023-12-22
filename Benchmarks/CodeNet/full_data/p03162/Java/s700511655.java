import java.util.Scanner;

public class Main {

	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int n = Integer.parseInt(sc.next());
		    
		    if (n<1 || n>100000) {
		    	System.out.println("Entrada invalida!!!");
		    	System.exit(0);
		    }
		    
		    int[][] acao = new int[n][3];
		    int[][] feliz = new int[n+1][3];
		    
		    for(int i = 0; i <= n; i++) {
		      for(int j = 0; j < 3; j++) {
		        feliz[i][j] = 0;
		      }
		    }
		    
		    for(int i = 0; i < n; i++) {
		      for(int j = 0; j < 3; j++) {
		        acao[i][j] = Integer.parseInt(sc.next());
		      }
		    }
		    
		    for(int i = 0; i < n; i++) {
		      for(int j = 0; j < 3; j++) {
		        for(int k = 0; k < 3; k++) {
		          if(j == k) continue;
		          feliz[i+1][j] = Math.max(feliz[i+1][j], feliz[i][k] + acao[i][j]);
		        }
		      }
		    }
		    
		    int answer = maxThree(feliz[n][0], feliz[n][1], feliz[n][2]);
		    System.out.println(answer);
		  }
		 
		  public static int maxThree(int a, int b, int c) {
		    int ans = a;
		    if(ans < b) ans = b;
		    if(ans < c) ans = c;
		    return ans;
		  }

}
